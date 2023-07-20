//precision lowp float;
precision highp float;

varying vec2 p;
varying float tp,t,Phi;
varying vec4 col;

uniform sampler2D tex1;

const float scale=50.;

const float NR=0.005*scale;
const float EW=0.002*scale;
const float EWH=0.001*scale;

#define M_PI 3.1415926535897932384626433832795

const float ratio=2.*sin(M_PI/3.);
const float iN=9.*ratio*.5/M_PI;
//const float L2=.5*.6;
//const float L1=.08*.8;

const float L2=.5*.4;
const float L1=.08*.7;

//const float phi=0.242564;

/*const mat2 rot = mat2(
   cos(phi), sin(phi),
   -sin(phi), cos(phi)
)*7.2111*iN;*/

void main() {
	float ds=dot(p,p);
	//float r=sqrt(ds);

	//float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/tp.y);
	
	float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/max(EWH,col.a-tp));


	vec2 stc=p*max(tp/sqrt(ds),1.);
	float r=sqrt(dot(stc,stc));
	if(r>col.a)discard;
	float rho=log(r/col.a)*iN-.2*t;
	float theta=(atan(stc.x,stc.y)+Phi)/ratio*iN;

	//vec2 pos=rot*vec2(rho,theta);
	//rho=pos.x;
	//theta=pos.y;

	vec2 p1=vec2(fract(rho), fract(theta)*ratio)-vec2(.5,.5*ratio);
	vec2 p2=vec2(fract(rho-.5), fract(theta-.5)*ratio)-vec2(.5,.5*ratio);

	float minr=min(dot(p1,p1),dot(p2,p2));

/*float v=L2*L2/minr+64.*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5);
	gl_FragColor.rgb = vec3(v,v>0.8?1.:0.,v>1.?1.:0.);
	gl_FragColor.a=1.;
	return;*/

	if(ds>NR*NR)// || 1>0)
	{

		if(minr<L2*L2){
			gl_FragColor.rgb=col.rgb*.5;
			float comp=max(L2-L1/r,0.);
			if(minr<comp*comp)
				gl_FragColor.a=0.0;
			else
				gl_FragColor.a=1.0;
		}
		else
		{
			if(srr<1.){
				gl_FragColor.rgb=col.rgb;
				gl_FragColor.a=.5;}
			else
			{
				gl_FragColor.rgb = 0.5*col.rgb;
				gl_FragColor.a=1.;
			}
		}
	}
	else
	{
		gl_FragColor.rgb = 0.5*col.rgb;
		gl_FragColor.a=1.;
	}
}