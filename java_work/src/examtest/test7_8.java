package examtest;

public class test7_8 {
	
	static int random(int a, int b) {
		int result=0;
		if(b<=a)b=a;
		result = (int)(Math.random()*(b-a+1)+a);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(random(5,3));

	}

}
