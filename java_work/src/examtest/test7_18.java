package examtest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test7_18 {
	
//	static int[] aryRmv(int[] arr, int idx) {	// 입력 idx의 값을 지우고 이후 값을 앞으로 당긴 후 마지막은 그전 값을 복사한다.
//		for(int i=idx; i< arr.length;i++) {		// 입력 idx부터 배열 끝까지 반복
//			if(i==arr.length-1) {				// 마지막 인덱스는 이전 인텍스의 값을 복사
//				arr[i] = arr[i-1];
//			}else {								// 현재 인덱스에 다음 인덱스의 값을 넣음
//				arr[i]= arr[i+1];
//			}
//		}
//		
//		return arr;
//	}
	static void aryRmv(int[] arr, int idx) {
		for(int i=idx; i< arr.length-1;i++) {
			arr[i]= arr[i+1];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ary = {1,3,4,7,9,11};
		aryRmv(ary, 3);
		System.out.println(Arrays.toString(ary));
		
		
	}

}
