package examtest;

import java.util.Scanner;

public class test4_26_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean retrychk = true;
		while(retrychk) {
			System.out.println("how many num?");
			int inputnum = sc.nextInt();
			int[] inputarray = new int[inputnum];
			int sum = 0;
			int avg = 0;
			
			for (int i = 0 ; i < inputarray.length; i++) {
				System.out.println("input num?");
				inputarray[i] = sc.nextInt();
				if(inputarray[i]==0) {
					retrychk = false;
					break;
				}
				sum+= inputarray[i];
			}
			avg = sum/inputnum;
			
			System.out.println("sum:"+sum);
			System.out.println("avg:"+avg);
		}

	}

}
