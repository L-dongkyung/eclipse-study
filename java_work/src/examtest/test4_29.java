package examtest;

import java.util.Scanner;

public class test4_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		outloop:
			for(int i=1; i <= 10; i++) {
				for (int j = 1; j<=5; j++) {
					System.out.print(i+"그룹 "+j+"번째 정수 입력:");
					int input = sc.nextInt();
					if(input == 88888) {
						break;
					} else if(input == 99999) {
						break outloop;
					}
					sum += input;
				}
			}
		System.out.println("총 합은 :"+sum);
	}
}