uniform mat4 uMVPMatrix;
attribute vec4 vPosition;
attribute vec4 vCenter;
varying vec2 p;
uniform float radius;

void main() {
	p=vPosition.xy;
	vec4 mp=vPosition;
	mp.xy=mp.xy*radius+vCenter.xy;
	gl_Position = uMVPMatrix * mp;
}