package examtest;

import java.util.Scanner;

public class test6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사람수는?");
		int people = sc.nextInt();
		int[] exam = new int[people];
		int sum = 0;
		int max = 0;
		int min = 100;
		
		for(int i=0; i< exam.length; i++) {
			System.out.println(i+1+"번 사람의 점수는?");
			int num = sc.nextInt();
			exam[i] = num;
			sum += num;
			if(max<num) {
				max = num;
			}
			if(min>num) {
				min = num;
			}
		}
		System.out.println("합계 :"+sum);
		System.out.println("평균 :"+(sum/(double)people));
		System.out.println("최고점 :"+max);
		System.out.println("최저점 :"+min);
		

	}

}
