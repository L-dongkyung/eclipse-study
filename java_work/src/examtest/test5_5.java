package examtest;

import java.util.Scanner;

public class test5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		int cnt = 0;
		for(;cnt <3;cnt++) {
			System.out.println(cnt+1+"��° ���� �Է�:");
			int input = sc.nextInt();
			sum += input;
		}
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+(sum/(double)cnt));

	}

}
