package examtest;

import java.util.Arrays;
import java.util.Scanner;

public class test3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[3];
		for(int i=0; i<3;i++) {
			array[i] = sc.nextInt();	
		}
		Arrays.sort(array);
		System.out.println(array[1]);
		
		
		
		
		
		

	}

}
