package exception;

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		try {
			System.out.print("�����:");
			System.out.print(this.left/this.right);
			System.out.println("�Դϴ�.");
		} catch (Exception e) {
			System.out.println("������ �߻��߽��ϴ� : "+e.getMessage());
			System.out.println("\n e.tostring():"+e.toString());
			System.out.println("e.print stackTrace()");
			e.printStackTrace();
		}
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		c1.divide();
		
		Calculator c2 = new Calculator();
		c2.setOperands(10, 5);
		c2.divide();
		

	}

}
