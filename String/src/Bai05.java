import java.util.Scanner;

public class Bai05 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        String[] tmp = hoTen.split("\\s+");
        int n = tmp.length;
        StringBuilder res = new StringBuilder();
        if (n > 0) {
            res.append(tmp[n - 1]);
            res.append(" ");
            if (n > 1) {
                for (int i = 0; i < n - 1; i++) {
                    res.append(tmp[i]);
                    res.append(" ");
                }
            }
            
        }
        System.out.println("Ten...ho...dem: " + res);
	}
}
