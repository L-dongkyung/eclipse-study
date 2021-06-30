package examtest;

import java.util.Arrays;

public class test7_21 {
	
	static void exchangeArray(int[] arr1, int[] arr2) {
		int arrleng=arr1.length;	// 배열의 길이 비교를 위해 1번배열의 길이를 확인한다
		if(arrleng>arr2.length) arrleng=arr2.length;	//1번 배열의 길이가 2번배열 길이보다 클경우 기준배열길이를 2번배열로 지정한다.
		for(int i=0;i<arrleng;i++) {	//기준 배열 길이만큼 반복한다.
			int tmp = arr1[i];	//1번배열값을 저장하고
			arr1[i] = arr2[i];	//1번배열값에 2번배열값을 저장한다
			arr2[i] = tmp;	//2번배열에 저장한 1번배열 값을 저장한다.
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,3,4,5,6,7};
		int[] y = {5,4,3,2,1};
		exchangeArray(x, y);
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));

	}

}
