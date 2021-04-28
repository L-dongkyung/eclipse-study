package examtest;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		array = new int[5];
		for (int i=0; i<array.length;i++) {
			array[i] = i;
//			System.out.println(array[i]);
		}
//		System.out.println();
		int[][] scores = new int[2][3];
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores);
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		

	}

}
