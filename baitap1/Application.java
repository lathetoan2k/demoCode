package baitap1;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		System.out.println("chọn phương thức bạn muốn dùng");
		System.out.println("1: thêm mới cán bộ");
		System.out.println("2: tìm kiếm theo họ tên");
		System.out.println("3: xem thông tin");
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		if (choose == 1) {
			themCanBo();
		}
		if (choose == 3) {
			QLCB qlcb = new QLCB();
			qlcb.showThongTin();
		}

	}

	private static void themCanBo() {
		// TODO Auto-generated method stub
		System.out.println("chọn cán bộ bạn muốn thêm: ");
		System.out.println("1: thêm mới công nhân");
		System.out.println("2: thêm kỹ sư");
		System.out.println("3: thêm nhân viên");
		Scanner scanner = new Scanner(System.in);
		int type = scanner.nextInt();
		switch (type) {
		case 1:
			themCongNhan();
			break;
		case 2:
			themKySu();
			break;
		case 3:
			themNhanVien();
			break;
		default:
			break;
		}

	}

	private static void themNhanVien() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập tên: ");
		String hoTen = scanner.nextLine();
		System.out.println("nhập giới tính: ");
		String gioiTinh = scanner.nextLine();
		System.out.println("nhập tuổi: ");
		int tuoi = scanner.nextInt();
		System.out.println("nhập công việc: ");
		String congViec = scanner.nextLine();
		System.out.println("nhập địa chỉ: ");
		String diaChi = scanner.nextLine();
		CanBo canBoMoi = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
		QLCB qlcb = new QLCB();
		qlcb.canBos.add(canBoMoi);

	}

	private static void themKySu() {
		// TODO Auto-generated method stub

	}

	private static void themCongNhan() {
		// TODO Auto-generated method stub

	}
}
