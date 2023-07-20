precision highp float;

varying vec2 p;
varying vec2 tp;
varying vec4 col;

const float scale=50.;

const float NR=0.005*scale;
const float EW=0.002*scale;
const float EWH=0.001*scale;

void main() {
	float ds=dot(p,p);
	if(ds>col.a*col.a)discard;
	//float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/tp.y);
	
	float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/max(EWH,col.a-tp.y));
	
	vec2 stc=0.5*p.xy/col.a*sqrt(srr);
	if(ds>NR*NR && srr<1.)
	{
		gl_FragColor.rgb = col.rgb;
		gl_FragColor.a=.5;
		if(srr<.3+0.7*tp.x)
		{
			gl_FragColor.rgb =vec3(0.55,0.4,0.3)*.7+ col.rgb*.3;
			gl_FragColor.a=1.;
		}
	}
	else
	{
		gl_FragColor.rgb = 0.5*col.rgb;
		gl_FragColor.a=1.;
	}
}