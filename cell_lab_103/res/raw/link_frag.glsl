precision highp float;


varying vec3 tp;



void main() {
	//float d1=1.-tp.x-tp.y;
	//float d2=1.+tp.x-tp.y;
	//float s=d1*d2/(tp.y*tp.y);
	float atan=tp.x/(1.-tp.y);
//	float x=mix(atan,tp.z,s/(1.+s));
	float x=mix(atan,tp.z,1.-abs(atan)*tp.y);
	if(fract(x*3.-(.5-.2))<0.4 && x<.7 && x>-.7)
	gl_FragColor = vec4(0,0.,0.,(tp.y-1.)*(tp.y-1.)+tp.x*tp.x-.1);
	else
	gl_FragColor = vec4(0,0.,0.,0.);
}