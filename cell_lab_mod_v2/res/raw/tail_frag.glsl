precision highp float;

varying vec2 p;
varying vec2 tp;
varying vec4 col;
varying float t;

const float scale=50.;

const float EW=0.002*scale;
const float END=0.7;
const float R=0.1;
const float TAIL_R=4.;
//all cords in cell radius, i think
void main() {

float d=length(p);
if(d<col.a-EW*.5)
     gl_FragColor.a=0.;
else
    gl_FragColor.a=1.;

float ww=(TAIL_R-tp.x)*0.1*(d-col.a)/col.a;
float my=sin(-t+tp.x*4.)*ww;
float k=4.*cos(-t+tp.x*4.)*ww; //17
float w=(1.-tp.x/(TAIL_R*END))*0.3*(1.+.5*k*k);// /sqrt(1.-k*k);
if(d-col.a<R*col.a  &&  1.>(1.-(d-col.a)/col.a/R) * (1.-(d-col.a)/col.a/R) )
	w+= R - R*sqrt(1. -   (1.-(d-col.a)/col.a/R) * (1.-(d-col.a)/col.a/R)   );



if( abs(tp.y-my)<w)   //+ 0.005/((col.a-d)*(col.a-d)/(col.a*col.a) + tp.x*tp.x))
{//if( abs(tp.y-my)>w-EW/col.a)
	gl_FragColor.rgb=col.rgb*0.5;
//	else
//	{
//	gl_FragColor.rgb=col.rgb;gl_FragColor.a=.5;
//	}
}else
	 gl_FragColor.a=0.;
	
	//gl_FragColor.rgb=vec3(1,.8,.8);
}