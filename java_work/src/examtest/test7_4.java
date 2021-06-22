package examtest;

public class test7_4 {
	
	public static int sumUp(int n) {
		int sum=0;
		for (int i=1;i<=n;i++) {
			sum +=i;
		}
		return sum;
	}
	public static int regsum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+regsum(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumUp(6));
		System.out.println(regsum(6));

	}
	5+함수4+함수3

}
