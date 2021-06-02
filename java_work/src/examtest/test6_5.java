package examtest;

import java.util.Arrays;

public class test6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[5];
		for(int i=0; i<arr.length ;i++) {
			arr[i] = arr.length-i;
		}
		System.out.println(Arrays.toString(arr));

	}

}
