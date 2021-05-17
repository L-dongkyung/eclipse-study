package examtest;

import java.util.Scanner;

public class test4_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many sum?");
		int loop = sc.nextInt();
		int sum = 0;
		int plus = 0;
		for(int i = 0; i < loop ; i++) {
			System.out.println("input num:");
			int input = sc.nextInt();
			if(input < 0) {
				System.out.println("input minus");
				continue;
			}
			sum+=input;
			plus++;
		}
		System.out.println("sum:"+sum);
		System.out.println("avg:"+(sum/plus));
		sc.close();
	}

}
