package scope;

class C2{
	static int w = 5;
	int v = 10;
	
	static void a() {
		// ("���� �޼ҵ�");
		int v = 50;
		int w = 55;
		System.out.println("�ν��Ͻ� v (�����޼ҵ忡�� �ν��Ͻ� v�� ���� �Ұ�" + ") ���� w(" + C2.w + ")���� v("+ v+ ") ���� w(" + w + ")");
	
	}
	
	void m() {
		// ("�ν��Ͻ� �޼ҵ�");
		int v = 20;
		int w = 15;
		System.out.println("�ν��Ͻ� v (" + this.v + ") ���� w(" + C2.w + ")���� v("+ v+ ") ���� w(" + w + ")");
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
