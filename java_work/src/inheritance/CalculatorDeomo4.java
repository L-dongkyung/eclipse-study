package inheritance;

class Calculator0 {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public Calculator0(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	 // setOprands는 없어도 됨 생성자를 생성함.
	
	public void sum() {
		System.out.println(left + right);
	}
	
	public void avg() {
		System.out.println((left+right)/2);
	}
}


public class CalculatorDeomo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		

	}

}
