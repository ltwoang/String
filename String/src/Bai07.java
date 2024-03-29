import java.util.Scanner;

public class Bai07 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("Nhập vào xâu s1: ");
        String s1 = sc.nextLine();
        System.out.print("Nhập vào xâu s2: ");
        String s2 = sc.nextLine();
        while (s1.contains(s2)) {
            s1 = s1.replace(s2, "");
        }

        System.out.println("Xâu sau khi loại bỏ các lần xuất hiện của s2: " + s1);
	}
}
