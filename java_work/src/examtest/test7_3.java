package examtest;

public class test7_3 {
	
	public static int middle(int a, int b, int c) {
		if((a>b && a<c)||(a>c && a<b)) {
			return a;
		}else if((b>a && b<c)||(b>c&&b<a)) {
			return b;
		}else if((c>a && c<b)||(c>b&&c<a)){
			return c;
		}else return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(middle(1,2,3));
		System.out.println(middle(2,1,3));
		System.out.println(middle(3,2,1));
		System.out.println(middle(2,3,1));
		System.out.println(middle(1,3,2));
		System.out.println(middle(3,1,2));

	}

}
