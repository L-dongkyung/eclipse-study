package examtest;

public class test7_13 {
	
//	set() - 원하는 비트의 자릿수를 1로 바꿈
//	reset() - 원하는 비트의 자릿수를 0으로 바꿈
//	inverse() - 원하는 비트의 자릿수를 반대로 바꿈

	
	static void printbit(int x) {
		for(int i=31; i>=0; i--) {
			System.out.print(((x>>>i & 1) ==1)? "1":"0");
		}
		System.out.println();
	}
	
	static int set(int x, int pos) {
		int ret;
		ret = x | 1<<pos;
		return  ret;
		
	}
	static int reset(int x, int pos) {
		int ret;
		ret = ~(1<<pos) & x;  // 원하는 비트에 1을 가져가고, ~(not)으로 0으로 바꾸고 x와 & 연산 
		return  ret;
		
	}
	static int inverse(int x, int pos) {
		int ret;
		ret = x ^ 1<<pos;
		return  ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1431655765;
		int pos = 10;
		
		printbit(x);
		printbit(set(x, pos));
		printbit(reset(x, pos));
		printbit(inverse(x, pos));
		
		

	}

}
