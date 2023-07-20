precision highp float;

varying vec2 p;
varying vec4 col;
varying vec4 dirs;
varying float ratioShift;

const float scale=50.;

const float NR=0.005*scale;
const float EW=0.002*scale;
const float AHW=0.0015*scale;
const float SHW=0.001*scale;
const float HH=0.008*scale;
const float HW=3.*AHW;

void main() {
    float d=dot(p,p);

    if(d>col.a*col.a)
        discard;

    float splitr=p.x*dirs.w-p.y*dirs.z;
    float dirr=dot(p,dirs.xy);
	float ddir=abs(p.x*dirs.y-p.y*dirs.x);
	float splitdir=abs(dot(p,dirs.zw)-ratioShift);

	if((ddir>AHW || dirr<0. || col.a-dirr<HH) && (ddir*HH>(col.a-dirr)*HW || col.a-dirr>HH) && (splitdir>SHW || fract(.25+.2*splitr/AHW)>.5))
	    gl_FragColor.a=0.;
	else
	    gl_FragColor.a=1.;

	if(col.r+col.g+col.b>1.5)
	    gl_FragColor.rgb =vec3(0.,0.,0.);
	else
	    gl_FragColor.rgb =vec3(1.,1.,1.);
}