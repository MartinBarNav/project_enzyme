precision highp float;

varying vec2 p;
varying vec2 tp;
varying vec4 col;
varying float rot;
varying vec2 move;
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
    
	float d=length(p)-col.a;
	//vec2 p2=p+vec2(1.,0.)*d*d*15.;
	//d=length(p2)-col.a;
	if(d<-0.01*col.a)
		discard;
	float side=(rot+dot(move,vec2(-p.y,p.x))/col.a)*d/(col.a)*30.;
	d=sqrt(d*d+side*side*col.a*col.a);
	side=(rot+dot(move,vec2(-p.y,p.x))/col.a)*d/(col.a)*30.;
	d=sqrt(d*d+side*side*col.a*col.a);
	
	float a=2.*fract(Nhat*(atan(tp.y,tp.x)-side));
	if(a>1.)a=2.-a;
	
	float x=(1.-a)*col.a*M_PI/N;
	float h;
	if(x<x1 || x>X)
		h=H*(1.-x/HW);
	else
		h=R-sqrt(R*R-(x-X)*(x-X));
	gl_FragColor.rgb=col.rgb*0.5;
	if(d<h)
		gl_FragColor.a=1.;
	else
		gl_FragColor.a=0.;
	

}