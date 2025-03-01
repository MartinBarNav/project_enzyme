uniform mat4 uMVPMatrix;
attribute vec4 vPosition;
attribute vec4 vColor;
attribute vec4 vTPosition;
attribute vec4 vCenter;
varying vec2 p;
varying vec2 tp,t12;
varying vec4 col;

const float scale=50.;

void main() {
	p=vPosition.xy*scale;
	tp=vTPosition.xy;
	t12=vTPosition.zw*(45./.4);
	col=vColor;
	col.a*=scale;
	vec4 tp2=vPosition;
	tp2.xy+=vCenter.xy;
	gl_Position = uMVPMatrix * tp2;
}