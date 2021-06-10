package examtest;

import java.util.Arrays;
import java.util.Scanner;

public class test6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소수:");
		int input = sc.nextInt();
		int arr[] = new int[input];
		

		for(int i=0; i<input; i++) {
			int j;
			do {
				arr[i] = (int)(Math.random()*10)+1;
				for(j=0;j<i; j++) {
					if(arr[i]== arr[j]) break;
				}
			} while (j<i);
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
