package examtest;

import java.util.Scanner;

public class test4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean play= true;
//		while(play) {
//			System.out.println("정수값을 입력하시오");
//			int intvalue = sc.nextInt();
//			if(intvalue > 0) System.out.println("이 값은 정수입니다.");
//			else if(intvalue < 0) System.out.println("이 값은 음수 입니다.");
//			else System.out.println("0입니다.");
//			System.out.println("다시 입력하시겠습니까?");
//			String Stringcontinue = sc.next();
//			if(Stringcontinue.equals("Yes")) ;
//			else play=false;
//		}
		
//		int retry = 1;
//		do {
//			System.out.println("정수값을 입력하시오");
//			int intvalue = sc.nextInt();
//			if(intvalue > 0) System.out.println("이 값은 정수입니다.");
//			else if(intvalue < 0) System.out.println("이 값은 음수 입니다.");
//			else System.out.println("0입니다.");
//			System.out.println("다시 입력하시겠습니까?");
//			retry = sc.nextInt();
//		}while(retry==1);
		
		for(int i = 1; i > 0 ;) {
			System.out.println("정수값을 입력하시오");
			int intvalue = sc.nextInt();
			if(intvalue > 0) System.out.println("이 값은 정수입니다.");
			else if(intvalue < 0) System.out.println("이 값은 음수 입니다.");
			else System.out.println("0입니다.");
			
			System.out.println("다시 입력하시겠습니까?");
			i = sc.nextInt();
		}
		

	}

}
