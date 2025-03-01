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
	
	float srr2=max(ds/((col.a-2.*EW)*(col.a-2.*EW)),2.*EW/(col.a-tp.y));
	float srr3=max(ds/((col.a-3.*EW)*(col.a-3.*EW)),3.*EW/(col.a-tp.y));
	//float srr2=max(ds/((col.a-2.*EW)*(col.a-2.*EW)),2.*EW/tp.y);
	//float srr3=max(ds/((col.a-3.*EW)*(col.a-3.*EW)),3.*EW/tp.y);
	vec2 stc=0.5*p.xy/col.a*sqrt(srr);
	if(ds<NR*NR || srr>1. || (srr2<1. && srr3>1.))
	{
		gl_FragColor.rgb = 0.5*col.rgb;
		gl_FragColor.a=1.;
	}
	else
	{gl_FragColor.rgb = col.rgb;
		gl_FragColor.a=.5;
		
	}
}