package examtest;

import java.util.Scanner;

public class test6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요소수:");
		int input = sc.nextInt();
		int arr[] = new int[input];
		
		for (int i=0; i< arr.length;i++) {
			System.out.println(i+"번째 숫자 입력:");
			int j = sc.nextInt();
			arr[i] = j;
		}
		System.out.println("앞에서 찾으면 1, 뒤에서 찾으면 아무숫자");
		int seq = sc.nextInt();
		if(seq==1) {
			
			System.out.println("찾는 숫자는?");
			int search = sc.nextInt();
			for(int i=0; i<arr.length;i++) {
				if (arr[i]==search) {
					System.out.println("찾는 숫자는 a["+i+"]에 있습니다.");
					break;
				}
			}
		}else {
			System.out.println("찾는 숫자는?");
			int search = sc.nextInt();
			for(int i=arr.length-1; i>=0;i--) {
				if (arr[i]==search) {
					System.out.println("찾는 숫자는 a["+i+"]에 있습니다.");
					break;
				}
			}
			
		}
//		boolean loop = false;
//		int i=0;
//		while(!loop) {
//			if(arr[i] == search) {
//				System.out.println("찾는 숫자는 a["+i+"]에 있습니다.");
//				loop = true;
//			}
//			i++;
//		}

	}

}
