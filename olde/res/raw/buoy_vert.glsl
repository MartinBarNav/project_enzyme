uniform mat4 uMVPMatrix;
attribute vec4 vPosition;
attribute vec4 vTPosition;
attribute vec4 vCenter;
attribute vec4 vColor;
varying vec2 p,phiTrig,phiTrig2;
varying vec2 tp;
varying vec4 col;

const float scale=50.;

void main() {
	p=vPosition.xy*scale;
	tp=vTPosition.xy;
	tp.y*=scale;
	phiTrig=vec2(cos(vTPosition.z),sin(vTPosition.z));
	phiTrig2=vec2(cos(vTPosition.w),sin(vTPosition.w));
	col=vColor;
	col.a*=scale;
	vec4 mp=vPosition;
	mp.xy+=vCenter.xy;
	gl_Position = uMVPMatrix * mp;
}