package examtest;

import java.util.Arrays;
import java.util.Scanner;

public class test6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] eng_mon = {"","Jan","Feb", "Mar","Apr","May","Jun",
				"Jul","Aug","Sep","Oct","Nov","Dec"};
		int retry = 0;
		int last_month = 0;
		System.out.println("해당 월의 영어단어를 입력하시오.");
		
		do {
			int month = (int)(Math.random()*12+1);
			if(month == last_month) {
				if(month ==12) {
					month--;
				}else {
					month++;
				}
			}
			System.out.println(month+"월은?");
			String ans = sc.next();
			if(ans.equals(eng_mon[month])) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다.");
			}
			last_month = month;
			System.out.println("다시 하시겠습니까?(yes:1, no=0)");
			retry = sc.nextInt();
		}while(retry == 1);
		String[] a = {"a", "b"};
		String[] b = {"c", "d", "e"};
		a = b;
		System.out.println(Arrays.toString(a));
	}
}
