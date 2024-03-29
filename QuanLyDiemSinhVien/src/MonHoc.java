import java.util.Scanner;

public class MonHoc {
	private int maMon;
	private static int nextMaMon = 100;
	private String tenMon;
	private int hocTrinh;
	private String loaiMon;
	public MonHoc() {
		this.maMon = nextMaMon++;
		this.tenMon = tenMon;
		this.hocTrinh = hocTrinh;
		this.loaiMon = loaiMon;
	}
	public int getMaMon() {
		return maMon;
	}
	public void setMaMon(int maMon) {
		this.maMon = maMon;
	}
	public String getTenMon() {
		return tenMon;
	}
	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}
	public int getHocTrinh() {
		return hocTrinh;
	}
	public void setHocTrinh(int hocTrinh) {
		this.hocTrinh = hocTrinh;
	}
	public String getLoaiMon() {
		return loaiMon;
	}
	public void setLoaiMon(String loaiMon) {
		this.loaiMon = loaiMon;
	}
	public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên môn học: ");
        this.tenMon = sc.nextLine();
        System.out.print("Nhập số đơn vị học trình: ");
        this.hocTrinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập loại môn học: ");
        this.loaiMon = sc.nextLine();
    }
	
	public String toString() {
        return "Mã môn: " + maMon + ", Tên môn: " + tenMon + ", Số đơn vị học trình: " + hocTrinh + ", Loại môn: " + loaiMon;
    }
	
	
	
}
