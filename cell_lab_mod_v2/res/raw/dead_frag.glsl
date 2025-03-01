precision highp float;

uniform sampler2D tex1;

varying vec4 p;
varying vec4 col;

const float NR=0.005;
const float EW=0.002;

/*
float rho(float r2,float ti)
{
	//return exp(-r2/ti)/ti;
	float rho0=(1.-exp(-1./ti));
	if(ti>2.) return rho0*exp(-r2/ti);
	else
		return 0.*rho0*((1. - tanh((r2 + ti - 1.)/(3.* ti)))/((1. - tanh((ti - 1.)/(ti*3.)))) + 
   exp(-r2/ti)* ti*ti/(4. + ti))/(1. + ti*ti/(4. + ti));
}*/

float rho(float r2,float st)
{
//#1
	return texture2D(tex1, vec2(r2*0.22596,st*0.285212)).r;
}

void main() {
	//float t=p.z*15.;
	
	float ds=dot(p.xy,p.xy);
	
	//MAX_R=0.03;
	//st to rho max=7.12028, stmax=7.12028/Ri<7.12028*MAX_R=0.213608
	//we want t to be more than tmax when p.z=1
	//#2
	float st=p.z*0.105185;
	
	//float t=p.z*0.002;
	
	
	//if(ds-col.a*col.a>10.*t)discard;
	
   /*
	 //only visible in slowmo
	float Ri=1./NR;
	float rho1=rho(ds*Ri*Ri,st*Ri);
	Ri=1./(col.a-EW);
	float rho2=rho(ds*Ri*Ri,st*Ri);
	Ri=1./col.a;
	float rho3=rho(ds*Ri*Ri,st*Ri);
	
	float ae=rho1+rho3-rho2;
	float ab=(rho2-rho1)*.5;
	gl_FragColor.rgb = (ab+.5*ae)*col.rgb/(ab+ae);
	gl_FragColor.a=(1.-(1.-ab)*(1.-ae));
*/

	//might be better :P
	float Ri=1./col.a;
	const float ratio=0.4;
	gl_FragColor.rgb = (ratio*0.5+(1.-ratio))*col.rgb;
	gl_FragColor.a=(ratio+0.5*(1.-ratio))*rho(ds*Ri*Ri,st*Ri);


	//if(p.x>0.)gl_FragColor.a=1.;
	
	//gl_FragColor.rgb =col.rgb;
	//gl_FragColor.a=rho3;
	
	/*gl_FragColor.rgb =0.85*col.rgb;
	gl_FragColor.a=0.7*(1.-p.z*p.z*p.z*p.z)*exp(-ds/(col.a*col.a*(t+.8)))/(t+.8);*/
	
}