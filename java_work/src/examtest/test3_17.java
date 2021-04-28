package examtest;

import java.util.Arrays;
import java.util.Scanner;

public class test3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		
		if(a1>a2) System.out.println("큰값은 "+a1+ " 작은값은 " +a2);
		else if(a2>a1) System.out.println("큰값은 "+a2+ " 작은값은 " +a1);
		else System.out.println("같습니다.");

	}

}
