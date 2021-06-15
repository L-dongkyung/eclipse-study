package examtest;

import java.util.Arrays;
import java.util.Scanner;

public class test6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소수");
		int input = sc.nextInt();
		int[] arr = new int[input];
		for(int i=0; i< input; i++) {
			System.out.println("배열안 수:");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<5000;i++) {
			int temp;
			int randint = (int)(Math.random()*input);
			temp = arr[0];
			arr[0] = arr[randint];
			arr[randint] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
