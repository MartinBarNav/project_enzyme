uniform mat4 uMVPMatrix;
attribute vec4 vPosition;
attribute vec4 vTPosition;
attribute vec4 vCenter;
attribute vec4 vColor;
varying vec2 p;
varying vec4 aux;
varying float tp;
varying vec4 col;
const float scale=50.;

void main() {
	p=vPosition.xy*scale;
	tp=vTPosition.y*scale;
	aux=vTPosition;
	col=vColor;
	col.a*=scale;
	vec4 mp=vPosition;
	mp.xy+=vCenter.xy;
	gl_Position = uMVPMatrix * mp;
}