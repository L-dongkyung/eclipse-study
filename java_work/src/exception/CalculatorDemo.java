package exception;

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
//		if (right==0) {
//			throw new IllegalArgumentException("�ι�° ���� ���� 0�� �� �� ����.");
//		}
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if (this.right==0) {
		throw new ArithmeticException("0���� ������ �ȵ�!");
	}
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
		try {
			
			c1.divide();
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		Calculator c2 = new Calculator();
		c2.setOperands(10, 5);
		c2.divide();
		

	}

}
