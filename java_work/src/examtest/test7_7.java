package examtest;

public class test7_7 {
	
	protected static String putChar(int n) {
		String charc = "";
		for(int i=0;i<n;i++) {
			charc += "c";
		}
		return charc;
	}
	
	public static void putStart(int n) {
		for(int i=0;i<putChar(n).length();i++) {
			for(int j=0;j<putChar(n).length();j++) {
				if(j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void putDollar(int n, String x) {
		for(int i=0;i<putChar(n).length();i++) {
			for(int j=0;j<putChar(n).length();j++) {
				if(j<=i) {
					System.out.print(x);
				}
			}
			System.out.println();
		}
	}
	
	static void Char1(char c, int n) {
		for(int i=0;i<n;i++) {
			System.out.println(c);
		}
	}
	static void stars(int n) {
		Char1('*',n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		putChar(6);
		putStart(6);
		putDollar(7,"^");
		
		int n=6;
		for(int i=0;i<n;i++) {
			stars(i);
			
		}
	}
}
