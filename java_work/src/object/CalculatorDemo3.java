package object;

public class CalculatorDemo3 {
	
	public static void avg(int l, int r) {
		System.out.println((l+r)/2);
	}
	public static void sum(int l, int r) {
		System.out.println(l+r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left, right;
		left = 10; right = 20;
		
		sum(left, right);
		avg(left, right);
		
		
		left = 20; right = 40;
		
		sum(left, right);
		avg(left, right);

	}

}
