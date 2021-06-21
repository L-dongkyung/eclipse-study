package examtest;

import java.util.Scanner;

public class test6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("학급수?");
		int[][] school = new int [sc.nextInt()][];
		int[] sum = new int[school.length];
		int total_sum = 0;
		int cnt = 0;
		
		for(int i=0; i< school.length;i++) {
			System.out.println(i+1+"반의 학생수?");
			school[i] = new int[sc.nextInt()];
			for(int j=0;j<school[i].length;j++) {
				System.out.println(i+1+"반 "+(j+1)+"번의 점수?");
				school[i][j] = sc.nextInt();
				sum[i] += school[i][j];
				cnt++;
			}
		}
		System.out.println("------출력--------");
		System.out.printf("%10s |%10s %10s\n","반","합계","평균");
		for(int i=0;i< sum.length;i++) {
			System.out.printf("%9d반 |%10d%10.1f\n",i+1,sum[i], sum[i]/(double)school[i].length);
			total_sum += sum[i];
		}
		System.out.printf("%10s |%10s%10.1f","합",total_sum,(double)total_sum/cnt);
		
		
		
	}

}
