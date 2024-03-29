import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        SinhVien[] danhSachSinhVien = new SinhVien[100];
	        MonHoc[] danhSachMonHoc = new MonHoc[100];
	        BangDiem[] danhSachBangDiem = new BangDiem[100];
	        int soLuongSV = 0;
	        int soLuongMH = 0;
	        int soLuongBangDiem = 0;
	        boolean daNhapSinhVien = false;
	        boolean daNhapMonHoc = false;
	        do {
	            System.out.println("		MENU		");
	            System.out.println("1. Nhập danh sách sinh viên mới.");
	            System.out.println("2. Nhập danh sách môn học mới.");
	            System.out.println("3. Nhập điểm cho mỗi sinh viên.");
	            System.out.println("4. Sắp xếp danh sách bảng điểm.");
	            System.out.println("5. Tính điểm tổng kết chung cho mỗi sinh viên.");
	            System.out.println("6. Thoát.");
	            System.out.print("Chọn chức năng (1-6): ");
	            choice = sc.nextInt();
	            sc.nextLine();
	            switch (choice) {
	                case 1:
	                    System.out.print("Nhập số lượng sinh viên mới: ");
	                    int nSV = sc.nextInt();
	                    sc.nextLine();
	                    for (int i = 0; i < nSV; i++) {
	                        danhSachSinhVien[soLuongSV] = new SinhVien();
	                        danhSachSinhVien[soLuongSV].nhapThongTin();
	                        soLuongSV++;
	                    }
	                    daNhapSinhVien = true;
	                    inDanhSachSinhVien(danhSachSinhVien, soLuongSV);
	                    break;
	                case 2:
	                    System.out.print("Nhập số lượng môn học mới: ");
	                    int nMH = sc.nextInt();
	                    sc.nextLine();
	                    for (int i = 0; i < nMH; i++) {
	                        danhSachMonHoc[soLuongMH] = new MonHoc();
	                        danhSachMonHoc[soLuongMH].nhapThongTin();
	                        soLuongMH++;
	                    }
	                    inDanhSachMonHoc(danhSachMonHoc, soLuongMH);
	                    daNhapMonHoc = true;
	                    break;
	                case 3:
	                	if (!daNhapSinhVien || !daNhapMonHoc) {
	                        System.out.println("Cần nhập danh sách sinh viên và danh sách môn học trước.");
	                        break;
	                    }
	                    nhapDiemBangDiem(danhSachBangDiem, danhSachSinhVien, danhSachMonHoc, soLuongBangDiem, soLuongSV, soLuongMH);
	                    soLuongBangDiem++;
	                    inBangDiem(danhSachBangDiem, soLuongBangDiem);
	                    break;
	                case 4:
	                	if (!daNhapSinhVien || !daNhapMonHoc) {
	                        System.out.println("Cần nhập danh sách sinh viên và danh sách môn học trước.");
	                        break;
	                    }
	                    sapXepBangDiem(danhSachBangDiem, soLuongBangDiem);
	                    inBangDiem(danhSachBangDiem, soLuongBangDiem);
	                    break;
	                case 5:
	                	if (!daNhapSinhVien || !daNhapMonHoc) {
	                        System.out.println("Cần nhập danh sách sinh viên và danh sách môn học trước.");
	                        break;
	                    }
	                    tinhDiemTongKetChung(danhSachBangDiem, danhSachMonHoc, soLuongBangDiem, soLuongMH);
	                    inBangDiem(danhSachBangDiem, soLuongBangDiem);
	                    break;
	                case 6:
	                    System.out.println("Thoát chương trình.");
	                    break;
	                default:
	                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
	            }
	        } while (choice != 6);
	    }
	 	


	    public static void inDanhSachSinhVien(SinhVien[] danhSachSinhVien, int soLuongSV) {
	        System.out.println("		Danh sách sinh viên		");
	        for (int i = 0; i < soLuongSV; i++) {
	            System.out.println(danhSachSinhVien[i]);
	        }
	    }


	    public static void inDanhSachMonHoc(MonHoc[] danhSachMonHoc, int soLuongMH) {
	        System.out.println("		Danh sách môn học		");
	        for (int i = 0; i < soLuongMH; i++) {
	            System.out.println(danhSachMonHoc[i]);
	        }
	    }


	    public static void nhapDiemBangDiem(BangDiem[] bangDiems, SinhVien[] danhSachSinhVien, MonHoc[] danhSachMonHoc, int soLuongBangDiem, int soLuongSV, int soLuongMH) {
	    	Scanner sc = new Scanner(System.in);
	        for (int i = 0; i < soLuongSV; i++) {
	            for (int j = 0; j < soLuongMH; j++) {
	                bangDiems[soLuongBangDiem] = new BangDiem();
	                bangDiems[soLuongBangDiem].setSinhVien(danhSachSinhVien[i]);
	                bangDiems[soLuongBangDiem].setMonHoc(danhSachMonHoc[j]);
	                System.out.printf("Nhập điểm cho sinh viên %s môn học %s: ", danhSachSinhVien[i].getHoTen(), danhSachMonHoc[j].getTenMon());
	                float diem = sc.nextFloat();
	                bangDiems[soLuongBangDiem].setDiem(diem);
	                soLuongBangDiem++;
	            }
	        }
	    }


	    public static void inBangDiem(BangDiem[] bangDiems, int soLuongBangDiem) {
	        System.out.println("		Bảng điểm		");
	        for (int i = 0; i < soLuongBangDiem; i++) {
	            System.out.println(bangDiems[i]);
	        }
	    }


	    public static void sapXepBangDiem(BangDiem[] danhSachBangDiem, int soLuongBangDiem) {
	        for (int i = 0; i < soLuongBangDiem - 1; i++) {
	            for (int j = 0; j < soLuongBangDiem - i - 1; j++) {
	                if (danhSachBangDiem[j].getSinhVien().getHoTen().compareToIgnoreCase(danhSachBangDiem[j + 1].getSinhVien().getHoTen()) > 0) {
	                    BangDiem temp = danhSachBangDiem[j];
	                    danhSachBangDiem[j] = danhSachBangDiem[j + 1];
	                    danhSachBangDiem[j + 1] = temp;
	                }
	            }
	        }
	    }


	    public static void tinhDiemTongKetChung(BangDiem[] danhSachBangDiem, MonHoc[] danhSachMonHoc, int soLuongBangDiem, int soLuongMH) {
	        for (int i = 0; i < soLuongBangDiem; i++) {
	            float diemTongKet = 0;
	            int soDonViHocTrinh = 0;
	            for (int j = 0; j < soLuongMH; j++) {
	                if (danhSachBangDiem[i].getMonHoc().getMaMon() == danhSachMonHoc[j].getMaMon()) {
	                    diemTongKet += danhSachBangDiem[i].getDiem() * danhSachMonHoc[j].getHocTrinh();
	                    soDonViHocTrinh += danhSachMonHoc[j].getHocTrinh();
	                }
	            }
	            if (soDonViHocTrinh > 0) {
	                diemTongKet /= soDonViHocTrinh;
	            }
	            danhSachBangDiem[i].setDiem(diemTongKet);
	        }
	    }

}
