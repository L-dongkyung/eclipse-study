package method;

public class MethodDemo3 {
	
	public static void numbering(int limit) {
		int i = 0;
		while (i<limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j = 0;j<1;j++) {
			numbering(5);
		}

	}

}
