precision highp float;

varying vec2 p;
varying vec2 tp,t12;
varying vec4 col;
#define M_PI 3.1415926535897932384626433832795

const float scale=50.;

const float N=33.;
const float Nhat=N/(2.*M_PI);
const float MAX_R=0.03*scale;
const float R=MAX_R*0.02;
const float H=MAX_R*0.4;
const float HW=MAX_R*0.1/2./2.;
const float X=HW+R*0.93945122136; //tan(atan(H/HW)/2.);
const float x1=X-R*0.99805257848; //sin(atan(H/HW));

void main() {

    float lp=length(p);
	float d=lp-col.a;
	//vec2 p2=p+vec2(1.,0.)*d*d*15.;
	//d=length(p2)-col.a;
	if(d<-0.01*col.a)
		discard;

	gl_FragColor.rgb=col.rgb*0.5;

//	vec2 rp=p/col.a;
//    vec2 d1=rp-vec2(1.,0);
//    vec2 d2=rp-vec2(-1.,0);
//    float rprp=dot(rp,rp);
//    float s=atan(rp.y*(1.-rprp),rp.x*(1.+rprp));
//	float h=col.a*0.2*s*fract(20.*log(rprp/(dot(d1,d1)*dot(d2,d2))));


//	float x1=p.x/col.a;
//    float y1=p.y/col.a;

    //float f=(1.+0.05);
    vec2 ntp=normalize(tp);
    float x1=ntp.x;//p.x/length(p);
    float y1=ntp.y;//p.y/length(p);
    //float x2=(atan(2.*y1,1. - x1*x1 - y1*y1));//*(.75+.25*aux.x);
    float d12=(x1-1.)*(x1-1.) + y1*y1;
    float d22=(x1+1.)*(x1+1.) + y1*y1;
    float y2=-.5*log(d12/d22);

    //float v=fract(clamp(x2*factor,-4.,4.));
    //float w=abs(sin(log(d12/d22)*10.+(y1>0.?t12.x:t12.y)))*.05*sqrt(d12*d22)*col.a;
    float w=abs(sin(log(d12/d22)*6.66+(y1>0.?t12.x:t12.y)))*.075*sqrt(d12*d22)*col.a;

	if(d<w)
		gl_FragColor.a=1.;
	else
		gl_FragColor.a=0.;

/*	vec2 rp=p/col.a;
    vec2 d1=rp-vec2(1.,0);
    vec2 d2=rp-vec2(-1.,0);
    gl_FragColor.r=fract(60.*log(dot(rp,rp)/(dot(d1,d1)*dot(d2,d2))));
    gl_FragColor.a=1.;*/
}