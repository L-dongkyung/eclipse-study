package examtest;

import java.util.Arrays;
import java.util.Scanner;

public class test6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ҽ� �Է�:");
		int arrinput = sc.nextInt();
		int[] arr = new int[arrinput];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+1+"��° ������� �Է°�:");
			arr[i] = sc.nextInt();
		}
		System.out.print("{");
		for(int i = 0; i < arr.length; i++) {
			if(i== arr.length-1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i]+", ");
			}
		}
		System.out.println("}");
	}

}
