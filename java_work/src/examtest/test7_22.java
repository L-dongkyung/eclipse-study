package examtest;

import java.util.Arrays;

public class test7_22 {
	
	static int[] cloneArray(int[] x) {	//매개변수로 배열을 받고, 리턴타입은 배열
		int[] a = new int[x.length];	//매개변수 길이만큼 새 배열을 만든다.
		for(int i=0; i<x.length;i++) {	//배열 길이만큼 반복한다.
			a[i] = x[i];	//매개변수배열의 각 값을 새 배열 값에 저장한다.
		}
		return a;	//새 배열을 리턴한다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {11,22,33,44,55};
		int[] a = cloneArray(x);
		System.out.println(Arrays.toString(a));

	}

}
