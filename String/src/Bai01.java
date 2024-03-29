import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Liet ke so thuan nghich co 6 chu so: ");
		for(int i = 100000; i < 10000000; i++) {
			String s = Integer.toString(i);
			if(checkSoThuanNghich(s) == true) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean checkSoThuanNghich(String s) {
		int n = s.length();
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) != s.charAt(n - i -1)) {
				return false;
			}
		}
		return true;
	}
	
}
