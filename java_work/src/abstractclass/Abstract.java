package abstractclass;

abstract class A{
	public abstract int b();
	abstract void c() ;
	public void d() {
		System.out.println("world");
	}
}
class B extends A{
	public int b() {
		System.out.println("상속 b");
		return 1;
	}
	public void c() {
		System.out.println("상속 c");
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A a = new A();
		A b = new B();
		b.b();
		b.c();
		b.d();
		

	}

}
