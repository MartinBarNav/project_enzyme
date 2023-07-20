uniform mat4 uMVPMatrix;
attribute vec4 vPosition;
attribute vec4 vCenter;
varying vec2 p;
varying vec4 cp;

void main() {
	vec4 vPositionShifted=vPosition;
	vPositionShifted.xy=vPosition.xy*(vCenter.z+0.005)+vCenter.xy;
	p=vPositionShifted.xy;
	cp=vCenter;
	gl_Position = uMVPMatrix * vPositionShifted;
}