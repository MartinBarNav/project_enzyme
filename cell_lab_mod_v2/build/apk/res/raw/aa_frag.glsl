precision highp float;


uniform sampler2D tex1;
uniform vec2 invTexSize;

varying vec2 tp;

void main() {
	//gl_FragColor.rgb=texture2D(tex1, tp).rgb;

	gl_FragColor=.25*(
	texture2D(tex1, tp+ vec2(-.5,-.5)*invTexSize)+
	texture2D(tex1, tp+ vec2(.5,-.5)*invTexSize)+
	texture2D(tex1, tp+ vec2(-.5,.5)*invTexSize)+
	texture2D(tex1, tp+ vec2(.5,.5)*invTexSize)
	);
	//gl_FragColor.rgba=vec4(1.0,0.0,0.0,1.0);
}