import java.time.Year;

class Sach {
    // Yêu cầu 1: Khai báo tất cả thuộc tính với từ khóa private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor không tham số
    public Sach() {
    }

    // Yêu cầu 4: Constructor có tham số đầy đủ (gọi lại setter để tận dụng kiểm tra dữ liệu)
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    // Yêu cầu 2: Các phương thức public getters và setters
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    // Yêu cầu 3 (ý 1): Kiểm tra năm xuất bản hợp lệ
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue(); // Lấy năm hiện tại tự động
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Loi: Nam xuat ban (" + namXuatBan + ") khong hop le!");
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    // Yêu cầu 3 (ý 2): Kiểm tra số lượng không âm
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Loi: So luong (" + soLuong + ") khong duoc am!");
        }
    }

    // Phương thức hiển thị thông tin sách (kế thừa từ Tuần 7)
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("-----------------------------");
    }
}

public class BTT8  {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor đầy đủ tham số (Yêu cầu 4)
        System.out.println("=== TAO SACH 1 (DU LIEU HOP LE) ===");
        Sach sach1 = new Sach("S01", "Lap trình Java OOP", "Nguyen Van A", 2024, 50);
        sach1.hienThiThongTin();

        // Kiểm tra tính đóng gói và điều kiện ràng buộc ở setter (Yêu cầu 2 & 3)
        System.out.println("=== KIEM TRA CAP NHAT DU LIEU ===");
        sach1.setNamXuatBan(2099); // Sẽ báo lỗi vì lớn hơn năm hiện tại
        sach1.setSoLuong(-10);     // Sẽ báo lỗi vì số lượng âm

        System.out.println("\n=== THONG TIN SACH 1 SAU KHI DUOC SUA SAI ===");
        sach1.hienThiThongTin(); // Giá trị cũ vẫn được bảo toàn

        // Cập nhật lại bằng dữ liệu hợp lệ qua setter
        System.out.println("=== CAP NHAT LAI DU LIEU SAI ===");
        sach1.setNamXuatBan(2025);
        sach1.setSoLuong(35);
        sach1.hienThiThongTin();
    }
}
