package examtest;

public class test7_2 {
	
	public static int minNum(int a, int b, int c) {
		if (a>b) {
			if(b>c) {
				return c;
			}else {
				return b;
			}
		}else {
			//a<b
			if(a>c) {
				return c;
			}else {
				return a;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(minNum(1,5,2));
		System.out.println(minNum(5,1,2));
		System.out.println(minNum(5,4,1));
		System.out.println(minNum(4,5,1));

	}

}
