package examtest;

import java.util.Scanner;

public class test4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int intrandom = (int)(Math.random()*90+10);
		do {
			System.out.println("10~99������ ������ �Է��ϼ���");
			int intvalue = sc.nextInt();
			if(intvalue >= 10 && intvalue < 100) {
				if (intrandom > intvalue) {
					System.out.println("�� ���� ���� �Է��ϼ���");
				}else if(intrandom < intvalue){
					System.out.println("�� ���� ���� �Է��ϼ���");
				}else if(intrandom == intvalue) {
					System.out.println("�����Դϴ�.");
					break;
				}
			}else {
				System.out.println("10~99 ������ ���� �Է��ϼ���");
				continue;
			}
		} while(true);

	}

}
