package examtest;

import java.util.Scanner;

public class test4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean play= true;
//		while(play) {
//			System.out.println("�������� �Է��Ͻÿ�");
//			int intvalue = sc.nextInt();
//			if(intvalue > 0) System.out.println("�� ���� �����Դϴ�.");
//			else if(intvalue < 0) System.out.println("�� ���� ���� �Դϴ�.");
//			else System.out.println("0�Դϴ�.");
//			System.out.println("�ٽ� �Է��Ͻðڽ��ϱ�?");
//			String Stringcontinue = sc.next();
//			if(Stringcontinue.equals("Yes")) ;
//			else play=false;
//		}
		
//		int retry = 1;
//		do {
//			System.out.println("�������� �Է��Ͻÿ�");
//			int intvalue = sc.nextInt();
//			if(intvalue > 0) System.out.println("�� ���� �����Դϴ�.");
//			else if(intvalue < 0) System.out.println("�� ���� ���� �Դϴ�.");
//			else System.out.println("0�Դϴ�.");
//			System.out.println("�ٽ� �Է��Ͻðڽ��ϱ�?");
//			retry = sc.nextInt();
//		}while(retry==1);
		
		for(int i = 1; i > 0 ;) {
			System.out.println("�������� �Է��Ͻÿ�");
			int intvalue = sc.nextInt();
			if(intvalue > 0) System.out.println("�� ���� �����Դϴ�.");
			else if(intvalue < 0) System.out.println("�� ���� ���� �Դϴ�.");
			else System.out.println("0�Դϴ�.");
			
			System.out.println("�ٽ� �Է��Ͻðڽ��ϱ�?");
			i = sc.nextInt();
		}
		

	}

}
