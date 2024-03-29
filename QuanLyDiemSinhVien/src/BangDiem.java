
public class BangDiem {
	private SinhVien sinhVien;
	private MonHoc monHoc;
	private float diem;
	public BangDiem() {
		this.sinhVien = sinhVien;
		this.monHoc = monHoc;
		this.diem = diem;
	}
	public SinhVien getSinhVien() {
		return sinhVien;
	}
	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}
	public MonHoc getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	
	public String toString() {
        return "Sinh viên: " + sinhVien.getHoTen() + ", Môn học: " + monHoc.getTenMon() + ", Điểm: " + diem;
    }
}
