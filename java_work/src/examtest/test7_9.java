package examtest;

import java.util.Scanner;

public class test7_9 {
	
	static String readPlusstr() {
		int n=0;
		String a="";
		while(n<1) {
			System.out.println("양의 정수값?");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		}
		while(n>0) {
			a+=n%10;
			n/=10;
		}
		return a;
	}
	static int readPlusint() {
		int n=0;
		int x=0;
		while(n<1) {
			System.out.println("양의 정수값?");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		}
		while(n>0) {
			int len=1;
			for(int i=1;i<(n+"").length();i++) {
				len *= 10;
			}
			x += len * (n%10);
			n/=10;
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(readPlusint());
		System.out.println(readPlusstr());
		

	}

}
