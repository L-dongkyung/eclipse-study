package examtest;

import java.util.Scanner;

public class test4_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개를 더할까요?(최대합 1000)");
		int cnt = sc.nextInt();
		int sum=0;
		int i;
		for(i=0; i<cnt ; i++) {
			System.out.println("정수 입력:");
			int input = sc.nextInt();
			sum+=input;
			if(sum >1000) {
				System.out.println("1000 넘김");
				System.out.println("마지막값 무시");
				sum -= input;
				break;
			}
		}
		System.out.println("합계는:"+sum);
		 System.out.println("평균은:"+(sum/i));

	}

}
