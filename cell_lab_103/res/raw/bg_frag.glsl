precision highp float;

varying vec2 p;
uniform vec4 dir;

void main() {
	float ds=dot(p,p);
	if(ds>1.02)discard;//gl_FragColor=vec4(0., 0., .0,0.0);
	else{
	if(ds>0.999)
		gl_FragColor=vec4(0., 0., .0,0.);
	else
	{
		ds=1.+(1.-dir.z)*(1.-ds)/dir.z;
		float py=dot(dir.xy,p);
		float l=dir.w*max((py*(1.-dir.z)+dir.z)/(ds*ds),0.);
		//vec4(0.73, 0.7, 1.0,1.)+
		//float m=fract(11.*p.x+20.*p.y);
		gl_FragColor=vec4(l*.5, l*0.35, l*0.25,1.);
	}}
}