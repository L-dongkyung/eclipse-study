package examtest;

import java.util.Arrays;
import java.util.Scanner;

public class test6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[][] exam = new int[6][3];
		double[] avg = new double[6];
		
		System.out.println("��ȣ ���� ���� ���� �Է�:");
		for(int i=0; i< exam.length; i++) {
			for(int j=0; j<exam[i].length;j++) {
				exam[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<avg.length;i++) {
			avg[i]= (exam[i][1]+exam[i][2]) / 2.0;
		}
		// ���
		System.out.println("no  ����   ����   ���");
		for(int i=0;i<exam.length;i++) {
			for(int j=0;j<exam[i].length;j++) {
				System.out.print(exam[i][j]+"    ");
			}
			System.out.printf("%.1f", avg[i]);
			System.out.println();
		}
		// ������� ����
		
		for(int k=1; k<3;k++) {
			int class_sum = 0;
			for(int i=0; i<exam.length;i++) {
				class_sum += exam[i][k];
			}
			System.out.printf("%.1f", class_sum / (double)exam.length);
			System.out.print("  ");
		}
		
		

	}

}
//	1 72 80
//	2 35 58
//	3 82 91
//	4 72 45
//	5 56 35
//	6 89 75