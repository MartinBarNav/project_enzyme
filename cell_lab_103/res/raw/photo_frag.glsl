//precision lowp float;
precision highp float;

varying vec2 p,phiTrig,phiTrig2;
varying float tp;
varying vec4 col;

uniform sampler2D tex1;

const float scale=50.;

const float NR=0.005*scale;
const float EW=0.002*scale;
const float EWH=0.001*scale;

#define M_PI 3.1415926535897932384626433832795


void main() {
	float ds=dot(p,p);
	if(ds>col.a*col.a)discard;
	//float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/tp.y);
	
	float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/max(EWH,col.a-tp));
	
	//vec2 stc=0.5*p.xy/length(p.xy)*sqrt(srr);
	vec2 stc=0.5*p.xy/col.a*sqrt(srr);
	float pl=texture2D(tex1, vec2(0.5,0.5)+vec2(stc.x*phiTrig.x-stc.y*phiTrig.y,stc.x*phiTrig.y+stc.y*phiTrig.x)).r
	+texture2D(tex1, vec2(0.5,0.5)+vec2(stc.x*phiTrig2.x-stc.y*phiTrig2.y,stc.x*phiTrig2.y+stc.y*phiTrig2.x)).g;
	if(ds>NR*NR && srr<1.)
	{
	  
		if(pl>0.5){
			gl_FragColor.rgb=vec3(0.0,0.6,0.1);//*0.5+0.5*col.rgb;
			gl_FragColor.a=1.;
			}
		else
		{
			if(pl>0.4 && 1<0)
			{
				gl_FragColor.rgb=0.5*col.rgb;
				gl_FragColor.a=1.;
				}
			else
			{
				gl_FragColor.rgb = col.rgb;
				gl_FragColor.a=.4;
			}
		}
	}
	else
	{
		gl_FragColor.rgb = 0.5*col.rgb;
		gl_FragColor.a=1.;
	}
}