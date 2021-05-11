package examtest;

import java.util.Scanner;

public class test4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int sum=0;
		for(int i = 0; i <= input;i++) {
			System.out.print(i);
			sum+=i;
			if(i==input) {
				System.out.print("="+sum);
			}else {System.out.print("+");}
		}

	}

}
