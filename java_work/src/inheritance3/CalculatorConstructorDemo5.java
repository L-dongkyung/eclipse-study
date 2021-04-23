package inheritance3;

class Calculator {
	int left, right;
	
	public Calculator() {}
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void setOperand(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class SubtractionableCalCulator extends Calculator{
	int center;
	
	public SubtractionableCalCulator(int left, int right, int center) {
		super(left, right);
		this.center = center;
//		this.left = left;
//		this.right = right;
	}
	
	public void substract() {
		System.out.println(this.left-this.right);
	}
}

public class CalculatorConstructorDemo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubtractionableCalCulator c1 = new SubtractionableCalCulator(10, 20, 1);
		c1.sum();
		c1.avg();
		c1.substract();

	}

}

