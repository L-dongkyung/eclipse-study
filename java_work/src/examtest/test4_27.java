package examtest;

import java.util.Scanner;

public class test4_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� ���ұ��?(�ִ��� 1000)");
		int cnt = sc.nextInt();
		int sum=0;
		int i;
		for(i=0; i<cnt ; i++) {
			System.out.println("���� �Է�:");
			int input = sc.nextInt();
			sum+=input;
			if(sum >1000) {
				System.out.println("1000 �ѱ�");
				System.out.println("�������� ����");
				sum -= input;
				break;
			}
		}
		System.out.println("�հ��:"+sum);
		 System.out.println("�����:"+(sum/i));

	}

}
