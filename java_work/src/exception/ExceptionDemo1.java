package exception;

class A{
	private int[] arr = new int[3];
	
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
//		} catch (Exception e){
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 바운더리 아웃");
		} catch(ArithmeticException e) {
			System.out.println("산술 에러");
		}catch(Exception e) {
			System.out.println("에러");
		}finally{
			System.out.println("finally");
		}
	}
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.z(10, 1);
		a.z(1, 0);
		a.z(2, 1);

	}

}
