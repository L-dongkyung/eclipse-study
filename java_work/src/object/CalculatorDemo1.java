package object;

class Calculator {
	static double PI=3.14;
	
	int l, r;
	
	public void SetOperands(int l, int r) {
		this.l = l;
		this.r = r;
	}
	
	public void sum() {
		System.out.println(this.l+this.r);
	}
	public void avg() {
		System.out.println((this.l + this.r) /2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		
		System.out.println(Calculator.PI);

	}

}
