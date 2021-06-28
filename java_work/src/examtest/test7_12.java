package examtest;

public class test7_12 {
	
	static String bin(int x) {
		String binx = Integer.toBinaryString(x);
		return   binx;
	}
	
	static void printbit(int x) {               // 강사님
		for(int i=31; i>=0;i--) {
			System.out.print(((x>>>i & 1) == 1)? '1':'0');
		}
	}
	static int roLeft(int x, int n) {			// 강사님
		int ret;
		n%=32;
		ret = n==0? x : (x<<n) | (x>>>(32-n));
		return ret;
	}
	
	static String rotateLeft(String x, int n) {
		for(int i=0;i<n;i++) {
			char tmp;
			tmp = x.charAt(0);
			x = x.substring(1);
			x += tmp;
		}
		return x;
	}
	static int roRight(int x, int n	) {			//강사님
		if(n<0) return roLeft(x, -n);
		int ret;
		n%=32;
		ret = n==0? x: (x>>>n) | (x<<(32-n));
		return ret;
	}
	
	static String rotateRight(String x, int n) {
		for(int i=0;i<n;i++) {
			char tmp;
			tmp = x.charAt(x.length()-1);
			x = x.substring(0,x.length()-1);
			x = tmp+x;
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1565857138;
		int n= 6;
		
		System.out.println(bin(x));
		System.out.println("오른쪽 : "+rotateRight(bin(x), 6));
		System.out.println("왼  쪽 : "+rotateLeft(bin(x), 6));
		System.out.println("강사님 오른쪽 : "+roRight(x, 6));
		System.out.println("강사님 왼  쪽 : "+roLeft(x, 6));

	}

}
