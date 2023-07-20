precision highp float;

const float scale=50.;
const float yscale=20./scale;

varying vec2 p;
varying vec2 tp;
varying vec4 col;
//varying float t;
#define M_PI 3.1415926535897932384626433832795

const float N=5.;
const float Nhat=N/(2.*M_PI);
const float MAX_R=0.03*scale;
const float R=MAX_R*0.04;
const float H=MAX_R*0.3;
const float HW=MAX_R*0.1/2.;
const float X=HW+R*0.84712708838; //tan(atan(H/HW)/2.);
const float x1=X-R*0.98639392383; //sin(atan(H/HW));
const int MAX_IT=9;
const mat2 m = mat2(
   1.,1.,
   1.,-1.
);

float GiveCx(float x,float y)
{
  return  (y*y*y*y-4.*y*y*y+(2.*x*x+2.)*y*y+(4.-4.*x*x)*y+x*x*x*x+6.*x*x-3.)
         /(4.*y*y*y*y-16.*y*y*y+(8.*x*x+24.)*y*y+(-16.*x*x-16.)*y+4.*x*x*x*x+8.*x*x+4.) ;
}
 
float GiveCy(float x,float y)
{
  return -(2.*x*y-2.*x)/(y*y*y*y-4.*y*y*y+(2.*x*x+6.)*y*y+(-4.*x*x-4.)*y+x*x*x*x+2.*x*x+1.);
}


void main() {
  float d=length(p)-col.a;
	
	if(d<-0.05*col.a)
		discard;
		
	float a=2.*fract(atan(tp.y,tp.x)*Nhat);
	if(a>1.)a=2.-a;
	vec2 c=vec2(GiveCx(1.563+a/3.,d*yscale),GiveCy(1.563+a/3.,d*yscale));
	vec2 z=c;
	//int ii=0;
	for(int i=0;i<MAX_IT;i++)
	{
		z=vec2(z.x * z.x - z.y * z.y,z.x * z.y *2.)+c;
		z=vec2(z.x * z.x - z.y * z.y,z.x * z.y *2.)+c;
		z=vec2(z.x * z.x - z.y * z.y,z.x * z.y *2.)+c;
		z=vec2(z.x * z.x - z.y * z.y,z.x * z.y *2.)+c;
		if(dot(z,z)>4.)z=vec2(2.,2.);
		//z=vec2(z2.x * z2.x - z2.y * z2.y,z2.x * z2.y*2.)+c;
		//z2=vec2(z.x * z.x - z.y * z.y,z.x * z.y*2.)+c;
		//z=vec2(z2.x * z2.x - z2.y * z2.y,z2.x * z2.y*2.)+c;
	//	if(dot(z,z)>4.){
	//		break;
	//		}
	//	ii++;
	}

	gl_FragColor.rgb=col.rgb*0.5;
	if(dot(z,z)>4.)//ii==MAX_IT)
	gl_FragColor.a=0.;
	else
		gl_FragColor.a=1.0;
	//gl_FragColor.rg+=z;
	//gl_FragColor.a=1.;
}