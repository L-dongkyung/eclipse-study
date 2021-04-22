package scope;

class C2{
	static int w = 5;
	int v = 10;
	
	static void a() {
		// ("정적 메소드");
		int v = 50;
		int w = 55;
		System.out.println("인스턴스 v (정적메소드에서 인스턴스 v는 접근 불가" + ") 정적 w(" + C2.w + ")지역 v("+ v+ ") 지역 w(" + w + ")");
	
	}
	
	void m() {
		// ("인스턴스 메소드");
		int v = 20;
		int w = 15;
		System.out.println("인스턴스 v (" + this.v + ") 정적 w(" + C2.w + ")지역 v("+ v+ ") 지역 w(" + w + ")");
	}
}

public class ScopeDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 c2 = new C2();
		C2.a();
		System.out.println("-------------------------");
		c2.m();
		

	}

}
