package examtest;

import java.util.Scanner;

public class test4_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input=0;
		System.out.println("��� ������ ���ұ��");
		int cnt = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < cnt;i++) {
			System.out.println("���� �Է�:");
			input = sc.nextInt();
			sum += input;
			if(input==0)break;
		}
		if(input!=0) {
			System.out.println("�հ�:"+sum);
			System.out.println("���:"+(sum/cnt));
		}
	}

}
