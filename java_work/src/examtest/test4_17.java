package examtest;

import java.util.Scanner;

public class test4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("º° °¹¼ö ÀÔ·Â :");
		int input = sc.nextInt();
		for(int i=0; i<input;i++) {
			if(i%5==4) {
				System.out.println("*");
			}else {
				System.out.print("*");
			}
		}

	}

}
