package examtest;

import java.util.Scanner;

public class test4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int intrandom = (int)(Math.random()*90+10);
		do {
			System.out.println("10~99사이의 정수를 입력하세요");
			int intvalue = sc.nextInt();
			if(intvalue >= 10 && intvalue < 100) {
				if (intrandom > intvalue) {
					System.out.println("더 높은 수를 입력하세요");
				}else if(intrandom < intvalue){
					System.out.println("더 낮은 수를 입력하세요");
				}else if(intrandom == intvalue) {
					System.out.println("정답입니다.");
					break;
				}
			}else {
				System.out.println("10~99 사이의 값을 입력하세요");
				continue;
			}
		} while(true);

	}

}
