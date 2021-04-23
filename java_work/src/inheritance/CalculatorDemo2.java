package inheritance;

class MultiplicationableCalulator extends Calculator{
	public MultiplicationableCalulator() {
	}
	
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationableCalulator c1 = new MultiplicationableCalulator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();

	}

}
