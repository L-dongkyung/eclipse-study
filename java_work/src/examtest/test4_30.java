package examtest;

import java.util.Scanner;

public class test4_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���߱� ����");
		int rightNum = (int)(Math.random()*100);
		for(int i=1; i<=6;i++) {
			System.out.println("���� �Է�");
			int input = sc.nextInt();
			if(input<rightNum) {
				System.out.println("�� ū �����Դϴ�.");
			}else if(input>rightNum){
				System.out.println("�� ���� �����Դϴ�");
			}else {
				System.out.println("�����Դϴ�.");
				System.out.println(i+"������ ���߾����ϴ�.");
				break;
			}
		}

	}

}
