package examtest;

import java.util.Scanner;

public class test4_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for(int i = 1; i <= input ; i ++) {
			for(int j = 0; j < input-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1 ;j++)
			System.out.print("*");
			System.out.println();
		}
	}
}
