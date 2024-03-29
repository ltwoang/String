import java.util.Scanner;

public class Bai02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap xau ky tu can chuyen: ");
		String s = sc.nextLine();
		int n = s.length();
		s = s.toLowerCase();
		System.out.println("Chuyen sang xen ke: ");
		System.out.println(xenKe(s));

	}

	public static String xenKe(String s) {
		StringBuilder res = new StringBuilder();  
		int n = s.length();
		for (int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				res.append(Character.toUpperCase(s.charAt(i)));
			}
			else {
	            res.append(s.charAt(i));
	        }
		}
		return res.toString();
	}
}
