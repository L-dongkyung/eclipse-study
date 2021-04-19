package method;

import java.util.Arrays;

public class ReturnDemo4 {
	public static String[] getMembers() {
		String[] members = {"ÃÖÁøÇõ","ÃÖÀ¯ºó","ÇÑÀÌ¶÷"};
		return members;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = getMembers();
		for (String e: members) {
			System.out.println(e);
		}
//		System.out.println(Arrays.toString(members));
		

	}

}
