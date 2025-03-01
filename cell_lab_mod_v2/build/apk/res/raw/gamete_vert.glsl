uniform mat4 uMVPMatrix;
attribute vec4 vPosition;
attribute vec4 vTPosition;
attribute vec4 vCenter;
attribute vec4 vColor;
varying vec2 p,phiTrig,phiTrig2;
varying float tp;
varying vec4 col;
const float scale=50.;

void main() {
	p=vPosition.xy*scale;
	tp=vTPosition.y*scale;
	col=vColor;
    col.a*=scale;
	phiTrig=vec2(cos(vTPosition.z),sin(vTPosition.z));
	phiTrig2=vec2(cos(vTPosition.w),sin(vTPosition.w));
	phiTrig=vec2(dot(p,phiTrig),dot(p,vec2(-phiTrig.y,phiTrig.x)))/col.a;

	vec4 mp=vPosition;
	mp.xy+=vCenter.xy;
	gl_Position = uMVPMatrix * mp;
}