package constructor;

class Calculator {
	int left, right, center;
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public Calculator(int left, int right, int center) {
		this.left = left;
		this.right = right;
		this.center = center;
		
	}
	
	 // setOprands는 없어도 됨 생성자를 생성함.
	
	public void sum() {
		System.out.println(left + right);
	}
	
	public void avg() {
		System.out.println((left+right)/2);
	}
}

public class CalculatorDemo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1 = new Calculator(10, 20);
		c1.sum();
		c1.avg();
		System.out.println(c1.center);
		
	}

}
