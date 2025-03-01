uniform mat4 uMVPMatrix;
attribute vec4 vPosition;
varying vec2 tp;

void main() {
	tp=vPosition.zw;
	vec4 mp;
	mp.xy=vPosition.xy;
	mp.zw=vec2(0.,1.);
	gl_Position = uMVPMatrix * mp;
}