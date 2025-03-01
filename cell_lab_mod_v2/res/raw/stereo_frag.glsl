precision highp float;

varying vec2 p;
varying vec2 tp;
varying vec4 col;
varying float rot;
varying vec2 move;
#define M_PI 3.1415926535897932384626433832795

const float scale=50.;

const float N=2.;
const float Nhat=N/(2.*M_PI);
const float MAX_R=0.03*scale;
const float R=MAX_R*0.02;
const float H=MAX_R*0.4;
const float HW=MAX_R*0.1/2./2.;
const float X=HW+R*0.93945122136; //tan(atan(H/HW)/2.);
const float x1=X-R*0.99805257848; //sin(atan(H/HW));
const float EW=0.002*scale;

const float n=7.;
const float d1overd2=1.075;//1.05;
const float d2=M_PI/(n-1.+2.*d1overd2);
const float d1=d2*d1overd2;
const float spikeLength=MAX_R*0.4;
const float factor=spikeLength/(1./(d1-d2)+1./(2.*d1-d2-(d1-d2)));

void main() {

    float lp=length(p);
	float d=lp-col.a+0.0001;
	//vec2 p2=p+vec2(1.,0.)*d*d*15.;
	//d=length(p2)-col.a;
	if(d<0.)
		discard;
	float phi=atan(tp.y,tp.x);
	float phif=floor(phi*Nhat)*(1./Nhat);
	
	float a=2.*Nhat*(phi-phif);


	//if(a>1.)a=2.-a;
	
	float x=(1.-a)*col.a*M_PI/N;
	float angle=atan(d,x);

	/*
	//float s=side/(1.+abs(side));
	float phir=phif+.5/Nhat;
    vec2 fast=vec2(cos(phir),sin(phir));
    float side=(rot+dot(move,vec2(-fast.y,fast.x)))*30.;
	float s=clamp(side,-1.,1.);
	if(s!=0.){
		float sp1=1.+s;
		angle=M_PI* (sp1 - sqrt(sp1*sp1-((4.* angle*s)/M_PI) ))/(2.*s);}
*/

	if(angle>.5*M_PI)angle=M_PI-angle;
	if(angle>d1)
		angle=fract((angle-d1)/d2)*d2+d1-d2;

	float ml=(1./angle+1./(2.*d1-d2-angle))*factor;


	gl_FragColor.rgb=col.rgb*0.5;
	if(x*x+d*d<ml*ml)
		gl_FragColor.a=1.;
	else
		gl_FragColor.a=0.;
	

}