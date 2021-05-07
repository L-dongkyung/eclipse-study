package examtest;

import java.util.Scanner;

public class test4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int i = 1;
		while(input > 0 ) {
			i *= input;
			input--;
		}
		System.out.println(i);

	}

}
