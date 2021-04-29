package examtest;

import java.util.Scanner;

public class test3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b) {
			int num;
			num = a;
			a=b;
			b=num;
		}

	}

}
