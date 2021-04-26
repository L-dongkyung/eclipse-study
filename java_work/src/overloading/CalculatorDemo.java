package overloading;

class Calculator1 {
	int left, right;
	int third=0;
	
	public void SetOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void SetOperands(int left, int right, int third) {
		this.SetOperands(left, right);
		this.third = third;
	}
	public void sum() {
		System.out.println(this.left+this.right+this.third);
	}
	public void avg() {
		System.out.println((this.left+this.right+this.third)/3);
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 c1 = new Calculator1();
		c1.SetOperands(10, 20);
		c1.sum();
		c1.avg();
		
		c1.SetOperands(10, 20, 30);
		c1.sum();
		c1.avg();

	}

}
