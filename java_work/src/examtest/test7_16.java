package examtest;

public class test7_16 {
	
	static int minof(int[] x) {
		int arr_min=x[0];
		for(int i=0; i<x.length;i++) {
			if(arr_min>x[i]) {
				arr_min=x[i];
			}
		}
		return arr_min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] height = {175, 163, 150, 181};
		int[] weight = {72, 82, 49, 76};
		
		System.out.println("작은키 :"+ minof(height));
		System.out.println("작은무게 : "+ minof(weight));

	}

}
