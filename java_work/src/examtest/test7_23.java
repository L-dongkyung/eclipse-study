package examtest;

import java.util.Arrays;

public class test7_23 {
	
	static int[] arrRmv(int[] x, int idx) {
		int[] a = new int[x.length-1];	// 입력 배열보다 길이가 하나 작은 배열 생성.
		if(idx <0 && idx >= x.length) {	// 배열의 인덱스 값을 벗어나면 함수 종료
			return x;	// 종료시 입력 배열을 그대로 반환
		}else {	// 인덱스 값이 0이상 이고 배열 길이 이하 일때 실행 
			for(int i=0; i< idx;i++) {	// 입력 인덱스 값 전까지 실행
				a[i] = x[i];	// idx 전까지는 새 배열에 값을 그대로 입력
			}
			for(int i=idx;i<a.length;i++) {	// idx 이후부터는 입력 배열의 다음 값을 입력
				a[i]=x[i+1];
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,3,4,7,9,11};
		int idx = 5;
		int[] a = arrRmv(x, idx);
		System.out.println(Arrays.toString(a));
		
		

	}

}
