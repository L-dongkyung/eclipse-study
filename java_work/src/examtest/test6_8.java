package examtest;

import java.util.Scanner;

public class test6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ҽ�:");
		int input = sc.nextInt();
		int arr[] = new int[input];
		
		for (int i=0; i< arr.length;i++) {
			System.out.println(i+"��° ���� �Է�:");
			int j = sc.nextInt();
			arr[i] = j;
		}
		System.out.println("�տ��� ã���� 1, �ڿ��� ã���� �ƹ�����");
		int seq = sc.nextInt();
		if(seq==1) {
			
			System.out.println("ã�� ���ڴ�?");
			int search = sc.nextInt();
			for(int i=0; i<arr.length;i++) {
				if (arr[i]==search) {
					System.out.println("ã�� ���ڴ� a["+i+"]�� �ֽ��ϴ�.");
					break;
				}
			}
		}else {
			System.out.println("ã�� ���ڴ�?");
			int search = sc.nextInt();
			for(int i=arr.length-1; i>=0;i--) {
				if (arr[i]==search) {
					System.out.println("ã�� ���ڴ� a["+i+"]�� �ֽ��ϴ�.");
					break;
				}
			}
			
		}
//		boolean loop = false;
//		int i=0;
//		while(!loop) {
//			if(arr[i] == search) {
//				System.out.println("ã�� ���ڴ� a["+i+"]�� �ֽ��ϴ�.");
//				loop = true;
//			}
//			i++;
//		}

	}

}
