public class Test{
	public static void main(String[] args){
		return;
	}

	public static float Test(float f1, boolean t){
		float f2 = 0.05f;
		float f3 = 20.0f;

		if(t){
			return f1 * f3;
		}
		return f1 * f2;
	}
}