package examtest;

import java.util.Scanner;

public class test4_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력:");
		int input = sc.nextInt();
		for (int i = 1; i<=input; i++) {
			System.out.println(i+"의 제곱은"+i*i+"입니다.");
		}
		

	}

}
