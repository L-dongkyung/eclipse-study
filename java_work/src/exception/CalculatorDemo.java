package exception;

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
//		if (right==0) {
//			throw new IllegalArgumentException("두번째 인자 값은 0이 올 수 없다.");
//		}
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if (this.right==0) {
		throw new ArithmeticException("0으로 나누면 안돼!");
	}
		try {
			System.out.print("계산결과:");
			System.out.print(this.left/this.right);
			System.out.println("입니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다 : "+e.getMessage());
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
