package examtest;



public class test7_1 {
	
	public static int signOf(int num) {
		if(num>0) {
			return 1;
		}else if(num<0) {
			return -1;
		}
		return 0;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		System.out.println(signOf(4));
		System.out.println(signOf(-5));
		System.out.println(signOf(0));
		
		

	}

}
