precision highp float;

varying vec2 p,phiTrig,phiTrig2;
varying vec2 tp;
varying vec4 col,aux;

uniform sampler2D tex1;

#define M_PI 3.1415926535897932384626433832795

const float scale=50.;

const float NR=0.005*scale;
const float EW=0.002*scale;
const float EWH=0.001*scale;
const float N=4.;
const float factor=(N+.2)*2./M_PI;



float Power(float x){return(x*x);}
const float pos=-0.6;
const float amount =0.1;
void main() {
	float ds=dot(p,p);
	if(ds>col.a*col.a)discard;
	
	float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/max(EWH,col.a-tp.y));
	
	vec2 stc=p.xy/col.a*sqrt(srr);
	//stc=stc/sqrt(sqrt(dot(stc,stc)));
	stc=p*max(tp.y/sqrt(ds),1.);
	//float pl=texture2D(tex1, vec2(0.5,0.5)+vec2(stc.x*phiTrig.x-stc.y*phiTrig.y,stc.x*phiTrig.y+stc.y*phiTrig.x)).r;

	float bend=aux.w*.7;
	float x=dot(stc,phiTrig);
	float y=dot(stc,vec2(phiTrig.y,-phiTrig.x));
		//aux.x, aux.w
	if(/*dot(stc,stc)*/ds>NR*NR &&  srr<1.)
	{
		float scale=(1.-.4*aux.x)/sqrt(1.-bend*bend);
		float x1=x/(col.a-EW)*scale;
		float y1=(y/(col.a-EW)+bend)*scale;
		float x2=(atan(2.*y1,1. - x1*x1 - y1*y1)-2.*bend*scale)/(1.-1.5*bend*bend);//*(.75+.25*aux.x);
		float y2=-.5*log(((x1-1.)*(x1-1.) + y1*y1)/((x1+1.)*(x1+1.) + y1*y1));
		float v=fract(clamp(x2*factor,-4.,4.));
		float w=abs(sin(2.*y2*factor))*.1;
		if(v>.3-w && v<.7+w)
		{
        	gl_FragColor.rgb = .75*col.rgb;
			gl_FragColor.a=1.;
        }
        else
		{
			gl_FragColor.rgb = col.rgb;
			gl_FragColor.a=.5;
        }
	}
	else
	{
		gl_FragColor.rgb = 0.5*col.rgb;
		gl_FragColor.a=1.;
	}
}