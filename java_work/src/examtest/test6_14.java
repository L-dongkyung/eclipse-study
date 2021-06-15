package examtest;

import java.util.Arrays;
import java.util.Scanner;

public class test6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수:");
		int input = sc.nextInt();
		
		int a[] = new int[input];
		int b[] = new int[input];
		for(int i=0; i< input; i++) {
			System.out.println("입력 숫자:");
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i< input; i++) {
			for(int j=1;j<input;j++)
				if(a[j]>a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
		}
		System.out.println(Arrays.toString(b));
		

	}

}
