uniform mat4 uMVPMatrix;
attribute vec4 vPosition;
attribute vec4 vCenter;
attribute vec4 vColor;
varying vec4 p;
varying vec4 col;

const float scale=50.;

void main() {
	p=vPosition;
	col=vColor;
	vec4 mp;
	mp.xy=vPosition.xy+vCenter.xy;
	mp.zw=vec2(0.,1.);
	gl_Position = uMVPMatrix * mp;
}