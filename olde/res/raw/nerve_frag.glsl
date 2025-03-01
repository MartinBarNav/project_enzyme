//precision lowp float;
precision highp float;

varying vec2 p;
varying vec4 aux;
varying float tp;
varying vec4 col;

uniform sampler2D tex1;

const float scale=50.;

const float NR=0.005*scale;
const float EW=0.002*scale;
const float EWH=0.001*scale;

#define M_PI 3.1415926535897932384626433832795

const float ratio=2.*sin(M_PI/3.);
const float N=6.;
const float iN=N*ratio*.5/M_PI;
//const float L2=.5*.6;
//const float L1=.08*.8;

const float L2=.4;
const float L1=.08*.7;

//const float phi=0.242564;

/*const mat2 rot = mat2(
   cos(phi), sin(phi),
   -sin(phi), cos(phi)
)*7.2111*iN;*/

void main() {
	float ds=dot(p,p);

	if(ds>col.a*col.a)discard;
	//float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/tp.y);
	
	float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/max(EWH,col.a-tp));

	//float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/max(EWH,col.a-tp.y));

	vec2 stc;//=p.xy/col.a*sqrt(srr);
	//stc=stc/sqrt(sqrt(dot(stc,stc)));
	stc=p*max(tp/sqrt(ds),1.);
	float r=length(stc);//sqrt(dot(stc,stc));

	float rho=(r-NR)/(col.a-NR-EW)-.5;
	float theta=(atan(p.x,p.y)+aux.z)*(N*.5/M_PI);

	//vec2 pos=rot*vec2(rho,theta);
	//rho=pos.x;
	//theta=pos.y;

	float part=floor(theta);
	vec2 p1=vec2(rho, (theta-part-.5)*2.);

	float minr=dot(p1,p1);


/*float v=L2*L2/minr+64.*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5);
	gl_FragColor.rgb = vec3(v,v>0.8?1.:0.,v>1.?1.:0.);
	gl_FragColor.a=1.;
	return;*/

	if(/*dot(stc,stc)*/ds>NR*NR)// || 1>0)
	{

		if(minr<L2*L2)
		{
			float comp=max(L2-L1/r,0.);
			if(minr<comp*comp)
			{
				gl_FragColor.rgb=.5*col.rgb;
				float mpart=mod(part,2.);
				float f;
				if(mpart==0.) {
					f=aux.x;
					if(f>0.)
						gl_FragColor.rgb=vec3(.83,.7,.0);
					else
						gl_FragColor.rgb=vec3(.83,.0,.7);
				}
				else
				{
					f=aux.w;
					if(f>0.)
						gl_FragColor.rgb=vec3(.42,.7,1.);
					else
						gl_FragColor.rgb=vec3(.7,1.,.42);
				}
				gl_FragColor.a=abs(f);
			}
			else
			{
				gl_FragColor.rgb=col.rgb*.5;
				gl_FragColor.a=1.0;
			}
		}
		else
		{
			if(srr<1.){
				gl_FragColor.rgb=col.rgb;
				gl_FragColor.a=.5;}
			else
			{
				gl_FragColor.rgb = 0.5*col.rgb;
				gl_FragColor.a=1.;
				//gl_FragColor.rgb=vec3(0.,p1.x,p1.y);
			}
		}
	}
	else
	{
		gl_FragColor.rgb = 0.5*col.rgb;
		gl_FragColor.a=1.;
	}
//
//	gl_FragColor.rg=vec2(.5,.5)+p;
//	gl_FragColor.ab=vec2(1.,theta*.2+.5);
}