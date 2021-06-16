package examtest;

import java.util.Scanner;

public class test6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] kor_week = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		String[] eng_week = {"monday","tuesday", "wednesday","thursday","friday", "saturday", "sunday"};
		
		System.out.println("해당 요일의 영어를 쓰시오");
		int retry = 1;
		int last_week = 0;
		while(retry ==1) {
			int rand;
			 do{
				rand = (int)(Math.random()*7);
			}while(rand==last_week);
			while(true) {
				System.out.print(kor_week[rand]+"?");
				String ans = sc.next();
				if(eng_week[rand].equals(ans)) {
					System.out.println("정답입니다.");
					break;
				}else {
					System.out.println("오답입니다.");
				}
			}
			last_week = rand;
			System.out.println("다시 하시겠습니까?(yes:1, no:0");
			retry = sc.nextInt();
		}
	}
}
