precision highp float;

varying vec2 p;
varying vec4 cp;

void main() {
	//float ds=dot(p,p);
	vec2 d=p-cp.xy;
	float ds2=length(d);
	//if(ds>1.0)discard;
	//float r2=cp.z*cp.z;
	//if(ds2>cp.z+0.005 || ds2<cp.z-0.005)discard;
    if(ds2>cp.z+0.003 || ds2<cp.z-0.003)discard;

	//gl_FragColor=vec4(cp.a, 0.1, 0.,1.);
	//gl_FragColor=vec4(cp.a, 0.1, .0, .87);
	gl_FragColor=cp.a*vec4(1., 0.66, .0, 0.);
}