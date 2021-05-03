package examtest;

import java.util.Scanner;

public class test4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("º° °¹¼ö?");
		int count = sc.nextInt();
		if(count>=1) {
			for(int i=0; i<count; i++)
				System.out.print("*");
			System.out.println();
		}
		sc.close();
		
	}
}
