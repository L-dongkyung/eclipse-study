package examtest;

import java.util.Scanner;

public class test5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		int cnt = 0;
		for(;cnt <3;cnt++) {
			System.out.println(cnt+1+"번째 정수 입력:");
			int input = sc.nextInt();
			sum += input;
		}
		System.out.println("합계:"+sum);
		System.out.println("평균:"+(sum/(double)cnt));

	}

}
