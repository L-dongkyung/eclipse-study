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
		System.out.println("�ش� ���� ����ܾ �Է��Ͻÿ�.");
		
		do {
			int month = (int)(Math.random()*12+1);
			if(month == last_month) {
				if(month ==12) {
					month--;
				}else {
					month++;
				}
			}
			System.out.println(month+"����?");
			String ans = sc.next();
			if(ans.equals(eng_mon[month])) {
				System.out.println("�����Դϴ�.");
			}else {
				System.out.println("�����Դϴ�.");
			}
			last_month = month;
			System.out.println("�ٽ� �Ͻðڽ��ϱ�?(yes:1, no=0)");
			retry = sc.nextInt();
		}while(retry == 1);
		String[] a = {"a", "b"};
		String[] b = {"c", "d", "e"};
		a = b;
		System.out.println(Arrays.toString(a));
	}
}
