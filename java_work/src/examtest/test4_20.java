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
				System.out.println("�� �Է�:");
				month = sc.nextInt();
			}while(month <1 || month >12);
			
			if(3<=month && 5>=month)System.out.println("��");
			else if(6<=month && 8>=month)System.out.println("����");
			else if(9<=month && 11>=month)System.out.println("����");
			else System.out.println("�ܿ�");
			
//			switch (month) {
//			case 3:case 4:case 5:System.out.println("��");break;
//			case 6:case 7:case 8:System.out.println("����");break;
//			case 9:case 10:case 11:System.out.println("����");break;
//			case 12:case 1:case 2:System.out.println("�ܿ�");break;
//			}
			do {
			System.out.println("�ٽ� �÷���:1 �׸�:2");
			replay = sc.nextInt();
			}while(replay!=1 && replay!=2);
		}while(replay == 1);
	}

}
