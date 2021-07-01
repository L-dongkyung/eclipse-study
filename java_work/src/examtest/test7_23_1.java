package examtest;

import java.util.Arrays;

public class test7_23_1 {
	
	
	public static void main(String[] args) {
	      int a[] = {1, 3, 4, 7, 9, 11};
	      int del_idx = 2;
	      removeArray(a, del_idx);
	      System.out.println(Arrays.toString(a));
	   }
	

	 static void removeArray(int[] arr, int del_idx) {
	      int temp[] = new int[arr.length-1];
	      for (int i = del_idx; i < arr.length-1; i++) {
	         arr[i] = arr[i+1];
	      }
	      for(int i = 0; i < temp.length; i++) {
	         temp[i] = arr[i];
	      }
	      System.out.println(Arrays.toString(temp));
	      arr = temp;
	      System.out.println(Arrays.toString(arr));
	   }
	   
	 
	   


}
