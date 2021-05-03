package examtest;

import java.util.Scanner;

public class test4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(int i = a; i <= b; i++) {
			System.out.println(i);
		}

	}

}
