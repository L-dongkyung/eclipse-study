package examtest;

public class test5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("x         xÀÇ Á¦°ö");
		for(int i=0; i<=1000;i++) {
			double x = i/1000.0;
			System.out.printf("%.3f     %.7f\n",x,(x*x));
		}
		System.out.println("-----------------");
		for(float j=0;j<=1;j+=0.001) {
			System.out.printf("%.7f     %.7f\n",j,(j*j));
		}
	}

}
