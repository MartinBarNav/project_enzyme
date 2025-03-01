uniform mat4 uMVPMatrix;
attribute vec4 vPosition;
attribute float vTP;
varying vec3 tp;

void main() {
	vec4 mp;
	tp.xy=vPosition.zw;
	tp.z=vTP;
	mp.xy=vPosition.xy;
	mp.zw=vec2(0.,1.);
	gl_Position = uMVPMatrix * mp;
}