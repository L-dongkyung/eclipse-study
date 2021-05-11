package examtest;

import java.util.Scanner;

public class test4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		if (input>0) {
			for(int i= 0 ;i < input;i++) {
				System.out.print("*");
			}
			System.out.println();
			int j=0;
			while(j<input) {
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
	}

}
