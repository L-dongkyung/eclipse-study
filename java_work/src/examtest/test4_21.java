package examtest;

import java.util.Scanner;

public class test4_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int count = 1;

		while (count <= input * input) {
			System.out.print("* ");
			if (count % input == 0) {
				System.out.println();
			}
			count++;
		}

		sc.close();

//		for (int i = 0; i < input ; i++) {
//			for(int j=0; j < input ; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
	}
}
