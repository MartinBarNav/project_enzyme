//precision lowp float;
precision highp float;

varying vec2 p,phiTrig,phiTrig2;
varying float tp;
varying vec4 col;


const float scale=50.;

const float NR=0.005*scale;
const float EW=0.002*scale;
const float EWH=0.001*scale;

#define M_PI 3.1415926535897932384626433832795


void main() {
	float ds=dot(p,p);
	if(ds>col.a*col.a)discard;
	//float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/tp.y);
	//phiTrig=phiTrig/
	float a=phiTrig.x;
	float b=phiTrig.y;
	float a2=a*a;
	float a3=a2*a;
	float a5=a3*a2;
	float a7=a5*a2;
	float b2=b*b;
	float b4=b2*b2;
	float b6=b4*b2;
	float ew=(a7 - 21.*a5*b2 + 35.*a3*b4 - 7.*a*b6);
	ew=EW*(1.1+5.*ew*ew);
	float srr=max(ds/((col.a-ew)*(col.a-ew)),ew/max(ew*.5,col.a-tp));
	
	//vec2 stc=0.5*p.xy/length(p.xy)*sqrt(srr);
	vec2 stc=0.5*p.xy/col.a*sqrt(srr);

	if((ds>NR*NR || 0.<dot(p,phiTrig2)) && srr<1.)
	{
		gl_FragColor.rgb = col.rgb;
		gl_FragColor.a=.4;
	}
	else
	{
		gl_FragColor.rgb = 0.5*col.rgb;
		gl_FragColor.a=1.;
	}
}