package access;

class Calculator1 {
	private int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	private int _sum() {
		return this.left + this.right;
	}
	
	public void sumDecoPlus() {
		System.out.println("+++++"+_sum()+"+++++");
	}
	public void sumDecoMinus() {
		System.out.println("-----"+_sum()+"-----");
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 c1 = new Calculator1();
		c1.setOperands(10, 20);
		c1.sumDecoPlus();
		c1.sumDecoMinus();

	}

}
