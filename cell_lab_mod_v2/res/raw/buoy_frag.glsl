precision highp float;

varying vec2 p,phiTrig,phiTrig2;
varying vec2 tp;
varying vec4 col;

uniform sampler2D tex1;

const float scale=50.;

const float NR=0.005*scale;
const float EW=0.002*scale;
const float EWH=0.001*scale;

#define M_PI 3.1415926535897932384626433832795

float Power(float x){return(x*x);}
const float pos=-0.6;
const float amount =0.1;
void main() {
	float ds=dot(p,p);
	if(ds>col.a*col.a)discard;
	
	float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/max(EWH,col.a-tp.y));
	
	vec2 stc;//=p.xy/col.a*sqrt(srr);
	//stc=stc/sqrt(sqrt(dot(stc,stc)));
	stc=p*max(tp.y/sqrt(ds),1.)/col.a;
	//float pl=texture2D(tex1, vec2(0.5,0.5)+vec2(stc.x*phiTrig.x-stc.y*phiTrig.y,stc.x*phiTrig.y+stc.y*phiTrig.x)).r;
	
	float x=dot(stc,phiTrig);
	float y=dot(stc,vec2(phiTrig.y,-phiTrig.x));
		
	if(dot(stc-phiTrig*.55,stc-phiTrig*.55)*col.a*col.a>NR*NR &&  srr<1.)
	{
	    float r=sqrt(dot(stc,stc)) + amount/dot(stc+phiTrig*pos,stc+phiTrig*pos);
	    if(r<.9)
	    {
			float grad=sqrt(Power(x/sqrt(Power(x) + Power(y)) - 
	           (2.*amount*(pos + x))/Power(Power(pos + x) + Power(y))) + 
	           Power(y)*Power(1./sqrt(Power(x) + Power(y)) - 
	           2.*amount/Power(Power(pos + x) + Power(y))));
	        float inner=.9-.08*grad;
			if(r<inner)
			{
			
			vec2 dir1=p/col.a+phiTrig*0.3;
			vec2 dir=vec2(dir1.x*phiTrig2.x+dir1.y* phiTrig2.y,dir1.x*phiTrig2.y-dir1.y* phiTrig2.x);
			float s=r*r/(inner*inner); 
			float tr=(1.-s)+s*r/(inner*length(dir));
			gl_FragColor.rgb  = col.rgb*.75;
			gl_FragColor.a=texture2D(tex1, vec2(0.5,0.5)+.5*dir*tr).b>.2?0.7:0.;
					//+texture2D(tex1, vec2(0.5,0.5)+.5*vec2(dir.x*dir.x-dir.y*dir.y,2.*dir.x*dir.y)*tr).b;
			}
			else 
			{
				gl_FragColor.rgb = 0.5*col.rgb;
				gl_FragColor.a=1.;
			}
		}
		else
		{
				gl_FragColor.rgb = col.rgb;
				gl_FragColor.a=.4;
		}
	}
	else
	{
		gl_FragColor.rgb = 0.5*col.rgb;
		gl_FragColor.a=1.;
	}
}