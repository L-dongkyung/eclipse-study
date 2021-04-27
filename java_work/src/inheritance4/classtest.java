package inheritance4;

class a{
	int left, right;
	public a(int left, int right) {
		this.left = left;
		this.right = right; 
	}
	public void b(int a, int b) {
		System.out.println(a+b);
	}
}

class b extends a{
	int c=0;
	public b(int a, int b){
		super(a, b);
		this.c = c;
		
		
	}
}

public class classtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
