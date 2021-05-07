package examtest;

import java.util.Scanner;

public class test4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int state=0;
		while(input >0){
			state++;
			input = input / 10;
		}
		System.out.println(state);
		sc.close();

	}

}
