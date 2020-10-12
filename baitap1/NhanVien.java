package baitap1;

public class NhanVien extends CanBo {
	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	public NhanVien(String name, int tuoi, String gioiTinh, String diaChi, String congViec) {
		super(name, tuoi, gioiTinh, diaChi);
		this.congViec = congViec;
	}
}
