package examtest;

import java.util.Scanner;

public class test6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������?");
		int people = sc.nextInt();
		int[] exam = new int[people];
		int sum = 0;
		int max = 0;
		int min = 100;
		
		for(int i=0; i< exam.length; i++) {
			System.out.println(i+1+"�� ����� ������?");
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
		System.out.println("�հ� :"+sum);
		System.out.println("��� :"+(sum/(double)people));
		System.out.println("�ְ��� :"+max);
		System.out.println("������ :"+min);
		

	}

}
