package examtest;

import java.util.Scanner;

public class test4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 입력:");
		int start = sc.nextInt();
		for (int i = start; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("종료 후 변수값:" + start);

	}

}
