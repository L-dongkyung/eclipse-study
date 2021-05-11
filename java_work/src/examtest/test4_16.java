package examtest;

import java.util.Scanner;

public class test4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double kg;
		
		System.out.println("최소값 입력:");
		int min = sc.nextInt();
		System.out.println("최대값 입력:");
		int max = sc.nextInt();
		System.out.println("증가값 입력");
		int step = sc.nextInt();
		
		System.out.println("신장  |  표준체중");
		System.out.println("--------------");
		for(int hight = min; hight <= max; hight += step) {
			kg = (hight - 100) * 0.9;
			System.out.println(hight + " | "+ kg);
		}

	}

}
