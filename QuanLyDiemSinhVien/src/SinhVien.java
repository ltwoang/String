import java.util.Scanner;

public class SinhVien {
	private static int nextMaSinhVien = 10000;
    private int maSV;
    private String hoTen;
    private String diaChi;
    private String soDT;
    private String lop;
	public SinhVien() {	
		this.maSV = nextMaSinhVien++;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDT = soDT;
		this.lop = lop;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.diaChi = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.soDT = sc.nextLine();
        System.out.print("Nhập lớp: ");
        this.lop = sc.nextLine();
    }
	public String toString() {
        return "Mã SV: " + maSV + ", Họ tên: " + hoTen + ", Địa chỉ: " + diaChi + ", Số điện thoại: " + soDT + ", Lớp: " + lop;
    }
	
    
}
