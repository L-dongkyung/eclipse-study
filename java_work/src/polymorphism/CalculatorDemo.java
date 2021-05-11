package polymorphism;

abstract class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	int _sum() {
		return this.left+this.right;
	}
	
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
	
}

class CalculatorDecoPlus extends Calculator{
	public void sum() {
		System.out.println("+ sum:"+_sum());
	}
	public void avg() {
		System.out.println("+ avg:"+(_sum()/2));
	}
	
}

class CalculatorDemcoMinus extends Calculator{
	public void sum() {
		System.out.println("- sum:"+_sum());
	}
	public void avg() {
		System.out.println("- avg:"+(_sum()/2));
	}
	
}

public class CalculatorDemo {
	
	public static void execute(Calculator cal) {
		System.out.println("실행결과:");
		cal.run();
	}
	public static void execute(CalculatorDecoPlus cal) {
		System.out.println("실행결과:");
		cal.run();
	}
	public static void execute(CalculatorDemcoMinus cal) {
		System.out.println("실행결과:");
		cal.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDecoPlus cp = new CalculatorDecoPlus();
		cp.setOperands(10, 20);
		cp.run();
		
		CalculatorDemcoMinus cm = new CalculatorDemcoMinus();
		cm.setOperands(10, 20);
		cm.run();
		
		execute(cp);
		execute(cm);
		
	}

}
