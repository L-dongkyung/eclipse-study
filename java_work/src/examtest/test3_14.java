package examtest;

import java.util.Scanner;

public class test3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		
		System.out.println(Math.min(Math.min(a1, a2), a3));
		
		int min = a1 < a2 && a1 < a3? a1 : a2 < a3 ? a2 : a3 ;
		
		System.out.println(min);

	}

}
