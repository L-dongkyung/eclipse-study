package examtest;

public class test7_6 {
	
	public static void printSeason(int num) {
		if(num>=3 && num <=5) {
			System.out.println("봄");
		}else if(num>=6&&num<=8) {
			System.out.println("여름");
		}else if(num>=9&&num<=11) {
			System.out.println("가을");
		}else if(num==12||(num>=1&&num<=2)){
			System.out.println("겨울");
		}
	}
	public static void printSeason2(int num) {
		switch (num) {
		case 3:case 4:
		case 5:System.out.println("봄");break;
		case 6:case 7:
		case 8:System.out.println("여름");break;
		case 9:case 10:
		case 11:System.out.println("가을");break;
		case 12:case 1:
		case 2:System.out.println("겨울");break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSeason2(1);
		printSeason2(2);
		printSeason2(3);
		printSeason2(4);
		printSeason2(5);
		printSeason2(6);
		printSeason2(7);
		printSeason2(8);
		printSeason2(9);
		printSeason2(10);
		printSeason2(11);
		printSeason2(12);
		System.out.println("---------------");
		printSeason2(13);
		printSeason2(0);
		
	}

}
