package object;

class Calculator2 {
	static double PI=3.14;
	static int base = 0;
	
	int left, right;
	
	public void SetOperands(int l, int r) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right) /2);
	}
}

public class CalculatorDemo2 {
	
	public static void sum(int i, int j) {
		System.out.println(i + j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10 , 20);
		sum(20, 40);

	}

}
