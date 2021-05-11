package examtest;

import java.util.*;
public class test_init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final double PI= 3.14;
		
		System.out.println("밑변를 입력하시오");
		double i = scan.nextDouble();
		System.out.println("높이를 입력하시오");
		double j = scan.nextDouble();
		//2-6
		// System.out.println("10을 더한값:"+(i+10)+"\n10을 뺀 값:"+(i-10));
		//2-7
//		System.out.println(i/10);
//		System.out.println(i%10);
		//2-8
//		System.out.println("합:"+(i+j)+"  평균:"+((i+j)/2));
		//2-9
//		System.out.println(i*j/2);
		//2-10
		System.out.println("넓이 :"+(4*PI*i*i));
		System.out.println("부피 :"+(4/3*PI*i*i*i));
		scan.close();

	}

}
