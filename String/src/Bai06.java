import java.util.Scanner;

public class Bai06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao cau: ");
		String s = sc.nextLine();
		String[] tmp = s.split("\\s+");
		
		for (int i = 0; i < tmp.length - 1; i++) {
            for (int j = 0; j < tmp.length - i - 1; j++) {
                if (soSanh(tmp[j], tmp[j + 1]) > 0) {
                    String t = tmp[j];
                    tmp[j] = tmp[j + 1];
                    tmp[j + 1] = t;
                }
            }
        }
		System.out.println("Các từ theo thứ tự Alphabet:");
        for (String i : tmp) {
            System.out.println(i);
        }
	}
	
	public static int soSanh(String tu1, String tu2) {
        return tu1.compareToIgnoreCase(tu2);
    }
}
