package examtest;

import java.util.Scanner;

public class test4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double kg;
		
		System.out.println("�ּҰ� �Է�:");
		int min = sc.nextInt();
		System.out.println("�ִ밪 �Է�:");
		int max = sc.nextInt();
		System.out.println("������ �Է�");
		int step = sc.nextInt();
		
		System.out.println("����  |  ǥ��ü��");
		System.out.println("--------------");
		for(int hight = min; hight <= max; hight += step) {
			kg = (hight - 100) * 0.9;
			System.out.println(hight + " | "+ kg);
		}

	}

}
