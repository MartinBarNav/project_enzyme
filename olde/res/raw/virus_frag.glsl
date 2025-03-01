precision highp float;

varying vec2 p;
varying vec2 tp;
varying vec4 col;
varying float t;
#define M_PI 3.1415926535897932384626433832795
const float scale=50.;

const float N=17.;
const float Nhat=N/(2.*M_PI);
const float MAX_R=0.03*scale;
const float R=MAX_R*0.04;
const float H=MAX_R*0.3;
const float HW=MAX_R*0.08/2.;
const float X=HW+R;

void main() {
	float d=length(p)-col.a;
	
	/*if(d<0.)
		discard;*/
		
	float a=2.*fract(Nhat*atan(tp.y,tp.x));
	if(a>1.)a=2.-a;
	/*if( 1.-sqrt(1.-sin(a))>sqrt(d)*2.)*/
	/*if(a<0.)
		discard;*/
	float x=(1.-a)*col.a*M_PI/N;
	float h;
	if(x<HW)
		h=H;
	else{
		if(x>X)
		h=0.;
		else
		h=R-sqrt(R*R-(x-X)*(x-X));}	
	if(d<h)
		gl_FragColor.rgb=col.rgb*0.5;
	else
		discard;
	
	gl_FragColor.a=1.;	
}