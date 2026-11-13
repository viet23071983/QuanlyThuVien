import java.util.Scanner;

class Sach {
    String masach;
    String tieude;
    String tacgia;
    int namxuatban;
    int soluong;

public Sach(String masach, String tieude, String tacgia, int namxuatban, int soluong) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
    }

    public void hienthithongtin() {
        System.out.println("Ma sach: " + masach);
        System.out.println("Tieu de: " + tieude);
        System.out.println("Tac gia: " + tacgia);
        System.out.println("Nam xuat ban: " + namxuatban);
        System.out.println("So luong: " + soluong);
    }
}

public class BTT7 {
    public static void main(String[] args) {
        Sach sach1 = new Sach("001",
                "Cau truc du lieu va giai thuat",
                "Le Thi A", 2022, 12);

        Sach sach2 = new Sach("002",
                "Phap luat dai cuong",
                "Le Van B", 2022, 3);

        System.out.println("==Thong tin Sach 1==");
        sach1.hienthithongtin();

        System.out.println("==Thong tin Sach 2==");
        sach2.hienthithongtin();
    }
}