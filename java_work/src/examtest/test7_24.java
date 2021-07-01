package examtest;

import java.util.Arrays;
import java.util.Scanner;

public class test7_24 {
	
	static int[] searchArrayIdx(int[] arr, int num) {
		int cnt = 0;	// 찾는 값의 갯수 확인을 위한 변수
		int[] ans = new int[arr.length];	// 찾는 값의 인덱스 값을 넣기 위한 배열
		for(int i=0; i< arr.length;i++) {	// 입력 배열에서 찾는값을 찾아 생성배열에 넣고 카운트
			if(num == arr[i]) {
				ans[cnt] = i;
				cnt++;
			}
		}
		if (cnt==0) {	// 찾는 값이 없을 경우 함수 종료
			System.out.println("일치하는 값이 없습니다.");
			return null;
		}
		int[] ret = new int[cnt];	// 찾은 값의 갯수만큼 새로운 배열 생성
		for(int i=0; i<ret.length;i++) {	// 찾은 배열 인덱스 값을 새 배열에 저장
			ret[i]=ans[i];
		}
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("many col:");
		int[] a = new int[sc.nextInt()];
		for(int i=0; i< a.length;i++) {
			System.out.println("input num:");
			a[i] = sc.nextInt();
		}
		
		int[] ans = searchArrayIdx(a, 2);
		System.out.println(Arrays.toString(ans));
	}
}
