package examtest;

import java.util.Arrays;

public class test7_19 {
	
	static void insertArray(int[] x, int idx, int num) {
		if(idx>=0 && idx < x.length) {				// index는 0부터 배열의 길이까지만 받고 범위 이탈시 배열 유지
			for(int i=x.length-1;i>idx;i--) {		// x배열의 마지막에 시작해서 삽입 인덱스 이전까지 반복
				x[i] = x[i-1];						// 현재 인텍스에 이전 값을 가지고 온다
			}
			x[idx] = num;							// 삽입 인덱스에 입력 값 삽입
	
		}else {
			System.out.println("인덱스 범위 이탈!!!");	//인덱스 범위 이탈시 알림
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,4,7,9,11};
		insertArray(arr, 9, 99);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
