package examtest;

import java.util.Scanner;

public class test6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ��:");
		int rows = sc.nextInt();
		int[][] arr = new int[rows][];
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+"���� �� ����?");
			int colum = sc.nextInt();
			arr[i] = new int[colum];
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("��Ұ�?");
				int value = sc.nextInt();
				arr[i][j] = value;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
