package polymorphism;

class A {
	public String x(){
		return "A.X";
	}
}
class B extends A{
	public String x() {
		return "B.X";
	}
	public String y() {
		return "Y";
	}
	
}

class B2 extends A {
	public String x() {
		return "B2.x";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		A obj2 = new B2();
		
		obj.x();
//		obj.y();
		System.out.println(obj.x());
		System.out.println(obj2.x());
		

	}

}
