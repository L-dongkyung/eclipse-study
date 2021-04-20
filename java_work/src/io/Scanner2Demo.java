package io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input num :");
		while (sc.hasNextInt()) {
			
			System.out.println(sc.nextInt()*1000);
			System.out.println("input num :");
		}
		sc.close();

	}

}
