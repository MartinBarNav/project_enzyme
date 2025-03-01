uniform mat4 uMVPMatrix;
attribute vec4 vPosition;
attribute vec4 vColor;
attribute vec4 vTPosition;
attribute vec4 vCenter;
varying vec2 p;
varying vec2 tp;
varying vec4 col;
varying float t;

const float scale=50.;

void main() {
	p=vPosition.xy*scale;
	tp=vTPosition.xy;
	t=vTPosition.z;
	col=vColor;

	col.a*=scale;

	vec4 tp=vPosition;
	tp.xy+=vCenter.xy;
	gl_Position = uMVPMatrix * tp;
}