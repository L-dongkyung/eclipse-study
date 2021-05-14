package examtest;

import java.util.Scanner;

public class test4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			for(int j = 0; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------");
		for (int i = input ; i > 0; i--) {
			for(int j = 0; j < i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println(input);
	}
}
