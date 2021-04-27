package examtest;

import java.util.Scanner;

public class test3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int intnum = sc.nextInt();
		if (intnum < 0) {
			System.out.println("음의 정수");
		}else {
			System.out.println("양의 정수");
		}
		sc.close();

	}

}
