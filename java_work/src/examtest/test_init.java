package examtest;

import java.util.*;
public class test_init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final double PI= 3.14;
		
		System.out.println("�غ��� �Է��Ͻÿ�");
		double i = scan.nextDouble();
		System.out.println("���̸� �Է��Ͻÿ�");
		double j = scan.nextDouble();
		//2-6
		// System.out.println("10�� ���Ѱ�:"+(i+10)+"\n10�� �� ��:"+(i-10));
		//2-7
//		System.out.println(i/10);
//		System.out.println(i%10);
		//2-8
//		System.out.println("��:"+(i+j)+"  ���:"+((i+j)/2));
		//2-9
//		System.out.println(i*j/2);
		//2-10
		System.out.println("���� :"+(4*PI*i*i));
		System.out.println("���� :"+(4/3*PI*i*i*i));
		scan.close();

	}

}
