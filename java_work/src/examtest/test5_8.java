package examtest;

public class test5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j =0;
		System.out.println("float         int");
		for(float i = 0f; i <=1; i=i+0.001f) {
			float k = j/1000.0f;
			System.out.printf("%9.7f %9.7f\n",i,k);
			j++;
		}
	}
}
