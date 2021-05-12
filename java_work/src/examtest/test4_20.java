package examtest;

import java.util.Scanner;

public class test4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month;
		int replay;
		do {
			do {
				System.out.println("월 입력:");
				month = sc.nextInt();
			}while(month <1 || month >12);
			
			if(3<=month && 5>=month)System.out.println("봄");
			else if(6<=month && 8>=month)System.out.println("여름");
			else if(9<=month && 11>=month)System.out.println("가을");
			else System.out.println("겨울");
			
//			switch (month) {
//			case 3:case 4:case 5:System.out.println("봄");break;
//			case 6:case 7:case 8:System.out.println("여름");break;
//			case 9:case 10:case 11:System.out.println("가을");break;
//			case 12:case 1:case 2:System.out.println("겨울");break;
//			}
			do {
			System.out.println("다시 플레이:1 그만:2");
			replay = sc.nextInt();
			}while(replay!=1 && replay!=2);
		}while(replay == 1);
	}

}
