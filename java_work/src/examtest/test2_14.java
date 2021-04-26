package examtest;

import java.util.Scanner;

public class test2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성과 이름을 입력하세요");
		String sung = sc.next();
		String name = sc.next();
		System.out.println(sung+" 씨성과 '"+name+"' 이름을 가진 인간 안녕!!!");
		sc.close();
	}
}
