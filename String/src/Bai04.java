import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		String s = sc.nextLine();
		tuDaiNhat(s);
	}
	public static void tuDaiNhat(String s) {
		String words[] = s.split("\\s+");
		int n = words.length;
		String tuDN = "";
		int viTri = -1;
		for (int i = 0; i < n; i++) {
			String tmp = words[i];
			if(tmp.length() > tuDN.length()) {
				tuDN = tmp;
				viTri = i;
			}
		}
		System.out.println("Tu dai nhat la: " + tuDN);
		System.out.println("Nam o vi tri: " + viTri);
	}
}
