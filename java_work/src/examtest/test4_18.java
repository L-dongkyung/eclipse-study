package examtest;

import java.util.Scanner;

public class test4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력:");
		int input = sc.nextInt();
		int count = 0;
		for(int i=1;i<=input;i++) {
			if(input % i == 0) {
				System.out.print(" "+i+" ");
				count++;
			}
		}
		System.out.println("갯수는:"+count+"개");
		
	}

}
