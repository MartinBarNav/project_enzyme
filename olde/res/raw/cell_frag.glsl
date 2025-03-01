
/*#ifdef GL_OES_standard_derivatives
	#extension GL_OES_standard_derivatives : enable
	#define AA(f) (clamp(0.5+(f)/fwidth(f), 0.0, 1.0))
#else
	#define AA(f) ((f)>0.?1.:0.)
#endif*/
//# ifdef GL_FRAGMENT_PRECISION_HIGH
precision highp float;
//# else
//precision mediump float;
//# endif

varying vec2 p;
varying float tp;
varying vec4 col;


const float scale=50.;

const float NR=0.005*scale;
const float EW=0.002*scale;


void main() {
	float ds=dot(p,p);

	
	//float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/(col.a-tp.y));
	float srr=max(ds/((col.a-EW)*(col.a-EW)),1.-col.a+tp+EW);
	
	//float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/tp.y);
	//vec2 stc=0.5*p.xy/col.a*sqrt(srr);
	//gl_FragColor=mix(vec4(col.rgb,.5),vec4(.5*col.rgb,1.), AA(NR*NR-ds) +AA(srr-1.));


	if(ds>col.a*col.a)discard;

	//gl_FragColor.a=gl_FragColor.a*AA(col.a*col.a-ds);

if(ds>NR*NR && srr<1.)
	{
		gl_FragColor.rgb = col.rgb;
		gl_FragColor.a=.5;//1.-exp(-sqrt(col.a*col.a-ds));
	}
	else
	{
		gl_FragColor.rgb = 0.5*col.rgb;
		gl_FragColor.a=1.;
	}
}