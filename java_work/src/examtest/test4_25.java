package examtest;

import java.util.Scanner;

public class test4_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input;
		do {
		System.out.println("�Ҽ� Ȯ�� ���� �Է�:");
		input = sc.nextInt();
		} while(input<1);

		int cnt = 0;
		for(int i=2;i< input;i++) {
			if(input % i == 0) {
				System.out.println("�Ҽ��� �ƴմϴ�.");
				cnt += 1;
				break;
			}
		}
		if(cnt==0) {
			System.out.println("�Ҽ��Դϴ�.");
		}
	}

}
