package examtest;

public class test7_15 {
	
	static int sumof(int[] x) {
		int sum=0;
		for(int i=0; i<x.length;i++) {
			sum += x[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {22,5,11,32,120};
		
		int x = sumof(arr);
		System.out.println(x);
	}

}
