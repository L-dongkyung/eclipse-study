package access;

class A {
	public String y() {
		return "public void y()";
	}
	private String z() {
		return "PUblic void z()";
	}
	public String x() {
		return z();
	}
}

public class Access1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		System.out.println(a.y());
		// System.out.println(a.z());    // 오류 발생
		System.out.println(a.x());

	}

}
