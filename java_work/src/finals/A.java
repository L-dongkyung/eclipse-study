package finals;

class A {
	final void b() {
		System.out.println("메소드도 final 사용 가능");
		System.out.println("final 메소드는 상속에서 오버라이딩 불가");
		}
	static final void c() {
		
	}
}

class B extends A {
//	void b() {	
//	}
	
}
