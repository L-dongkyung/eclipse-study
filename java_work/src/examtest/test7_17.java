package examtest;

public class test7_17 {
	
	static int linearSearch(int[] x, int y) {
		int[] idx = new int[x.length];
		int k=0;
		for(int i=0; i< x.length; i++) {
			if(y == x[i]) {
				idx[k] = i;
				k++;
			}
		}
		if(k>1) {
			System.out.println("해당 값의 요소가 여러개 존재합니다.");
		}else if(k==0){
			System.out.println("해당 값의 요소가 없습니다.");
			return -1;
		}
		return idx[0];
	}
	static int linearSearchR(int[] x, int y) {
		int[] idx = new int[x.length];
		int k=0;
		for(int i=0; i< x.length; i++) {
			if(y == x[i]) {
				idx[k] = i;
				k++;
			}
		}
		if(k>1) {
			System.out.println("해당 값의 요소가 여러개 존재합니다.");
		}else if(k==0){
			System.out.println("해당 값의 요소가 없습니다.");
			return -1;
		}
		return idx[--k];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {5, 22, 74, 32, 120, 22};
		System.out.println("가장 앞에 위치한 값은 x["+linearSearch(x, 22)+"]에 있습니다.");
		System.out.println("가장 뒤에 위치한 값은 x["+linearSearchR(x, 22)+"]에 있습니다.");

	}

}
