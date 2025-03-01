uniform mat4 uMVPMatrix;
attribute vec4 vPosition;
attribute vec4 vTPosition;
attribute vec4 vCenter;
attribute vec4 vColor;
varying vec2 p;
varying vec4 col;
varying vec4 dirs;
varying float ratioShift;

const float scale=50.;

void main() {
	p=vPosition.xy*scale;
	col=vColor;
	col.a=col.a*scale;
	vec4 mp=vPosition;
	mp.xy+=vCenter.xy;
	gl_Position = uMVPMatrix * mp;
	ratioShift=vTPosition.w*scale;//y
	dirs.xy=vec2(cos(vTPosition.z),sin(vTPosition.z));
	dirs.zw=vec2(cos(vTPosition.x),sin(vTPosition.x));
}