precision highp float;

varying vec2 p;
varying vec4 c;

const float NR=0.007;

void main() {
	float ds=dot(p,p);
	if(ds>1.)discard;
	//gl_FragColor=vec4(0.6,0.4,0.2,0.3);
	gl_FragColor=c;//vec4(0.6,0.4,0.2,0.43);
}