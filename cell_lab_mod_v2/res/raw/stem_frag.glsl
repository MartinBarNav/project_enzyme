//precision lowp float;
precision highp float;

varying vec2 p;
varying float tp,r1,r2,Phi;
varying vec4 col;

uniform sampler2D tex1;

const float scale=50.;

const float NR=0.005*scale;
const float EW=0.002*scale;
const float EWH=0.001*scale;

#define M_PI 3.1415926535897932384626433832795

const float ratio=2.*sin(M_PI/3.);
const float iN=9.*ratio*.5/M_PI;
//const float L2=.5*.6;
//const float L1=.08*.8;

const float L2=.01;
const float L1=.08*.7;

//const float phi=0.242564;

/*const mat2 rot = mat2(
   cos(phi), sin(phi),
   -sin(phi), cos(phi)
)*7.2111*iN;*/

void main() {
	float ds=dot(p,p);
	//float r=sqrt(ds);

	//float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/tp.y);
	
	float srr=max(ds/((col.a-EW)*(col.a-EW)),EW/max(EWH,col.a-tp));


	vec2 stc=p*max(tp/sqrt(ds),1.);
	float r=sqrt(dot(stc,stc));
	if(r>col.a)discard;
	float rho=log((col.a-NR)/(r-NR));
	float theta=(atan(stc.x,stc.y)+Phi);
	if(theta>M_PI)
		theta-=2.*M_PI;
	if(theta<-M_PI)
		theta+=2.*M_PI;
	//vec2 pos=rot*vec2(rho,theta);
	//rho=pos.x;
	//theta=pos.y;

	vec2 p2=vec2(rho-r2, theta);
	float a;
	if(theta>0.)
		a=theta-M_PI;
	else
		a=theta+M_PI;
	vec2 p1=vec2(rho-r1, a);


/*float v=L2*L2/minr+64.*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5)*(r/col.a-.5);
	gl_FragColor.rgb = vec3(v,v>0.8?1.:0.,v>1.?1.:0.);
	gl_FragColor.a=1.;
	return;*/

	if(/*dot(stc,stc)*/ds>NR*NR)// || 1>0)
	{
			if(srr<1.){
				if(dot(p1,p1)/(r1*r1)<1.)
				{
					gl_FragColor.rgb=col.rgb*.75+vec3(.3,0.,.0);
					gl_FragColor.a=1.0;
				}
				else
				{
				if(dot(p2,p2)/(r2*r2)<1.){
						gl_FragColor.rgb=col.rgb*.75+vec3(.0,0.,.3);
                		gl_FragColor.a=1.0;
				}else
					gl_FragColor.rgb=col.rgb;
					gl_FragColor.a=.5;
				}
			}
			else
			{
				gl_FragColor.rgb = 0.5*col.rgb;
				gl_FragColor.a=1.;
			}

	}
	else
	{
		gl_FragColor.rgb = 0.5*col.rgb;
		gl_FragColor.a=1.;
	}
}