package examtest;

import java.util.Scanner;

public class test7_10 {
	static boolean confirmRetry() {
		Scanner sc = new Scanner(System.in);
		System.out.println("다시한번? yes=1, no=0");
		int retry = sc.nextInt();
		return retry == 1;
	}
	static int randint() {
		int x = (int)(Math.random()*900+100);
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("암한 훈련");
		int retry=0;
		do {
			int x = randint();
			int y = randint();
			int z = randint();
			int val = 0;
			int select = (int)(Math.random()*4);
			while(true){
				switch (select) {
				case 0:System.out.println(x+"+"+y+"+"+z+"=");
					val = x+y+z;break;
				case 1:System.out.println(x+"+"+y+"-"+z+"=");
					val = x+y-z;break;
				case 2:System.out.println(x+"-"+y+"+"+z+"=");
					val = x-y+z;break;
				case 3:System.out.println(x+"-"+y+"-"+z+"=");
					val = x-y-z;break;				
				}
				int input = sc.nextInt();
				if(val == input) {
					System.out.println("정답입니다.");
					break;
				}else {
					System.out.println("오답입니다.");
				}
			}
		}while(confirmRetry());

	}

}
