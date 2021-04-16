package loop;

public class MulDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2;i<10;i++) {
			System.out.println("\n"+i+"단 입니다.");
			for (int j= 1;j<10;j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}

	}

}
