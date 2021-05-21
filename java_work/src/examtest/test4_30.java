package examtest;

import java.util.Scanner;

public class test4_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 맞추기 게임");
		int rightNum = (int)(Math.random()*100);
		for(int i=1; i<=6;i++) {
			System.out.println("숫자 입력");
			int input = sc.nextInt();
			if(input<rightNum) {
				System.out.println("더 큰 숫자입니다.");
			}else if(input>rightNum){
				System.out.println("더 낮은 숫자입니다");
			}else {
				System.out.println("정답입니다.");
				System.out.println(i+"번만에 맞추었습니다.");
				break;
			}
		}

	}

}
