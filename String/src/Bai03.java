import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi can chuan hoa: ");
		String s = sc.nextLine();
		System.out.println(chuanHoa(s));

	}
	
	public static String chuanHoa(String s) {
		String[] words = s.toLowerCase().split("\\s+");
		StringBuilder res = new StringBuilder();
		for ( String it : words) {
			if(!it.isEmpty()) {
				res.append(Character.toUpperCase(it.charAt(0)));
				res.append(it.substring(1));
			}
			res.append(" ");
		}
		return res.toString().trim();
	}
}	
