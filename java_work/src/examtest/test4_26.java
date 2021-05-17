package examtest;

import java.util.Scanner;

public class test4_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input=0;
		System.out.println("몇개의 정수를 더할까요");
		int cnt = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < cnt;i++) {
			System.out.println("정수 입력:");
			input = sc.nextInt();
			sum += input;
			if(input==0)break;
		}
		if(input!=0) {
			System.out.println("합계:"+sum);
			System.out.println("평균:"+(sum/cnt));
		}
	}

}
