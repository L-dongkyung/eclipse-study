package io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오:");
		System.out.println(sc.nextInt()*1000);
//		String i = sc.next();
//		System.out.println(i+100);
		sc.close();

	}

}
