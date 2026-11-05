import java.util.Scanner;

class sach {
    private String masach;
    private String tensach;
    private int soluong;
    private double giatien;

    public sach() {}

    public sach (String masach, String tensach, int soluong, double giatien) {
        this.masach = masach;
        this.tensach = tensach;
        this.soluong = soluong;
        this.giatien = giatien;
    }

    public void nhapthongtin(Scanner sc) {
        System.out.print("  + nhap ma sach: ");
        this.masach = sc.nextLine();
        System.out.print("  + nhap ten sach: ");
        this.tensach = sc.nextLine();
        System.out.print("  + nhap so luong: ");
        this.soluong = Integer.parseInt(sc.nextLine());
        System.out.print("  + nhap gia tien: ");
        this.giatien = Double.parseDouble(sc.nextLine());
    }

    public void hienthithongtin() {
        System.out.printf("ma: %-10s | ten: %-20s | so luong: %-5d | gia: %,.2f VND\n",
                masach, tensach, soluong, giatien);
    }

    public String getmasach() {
        return masach;
    }

    public int getsoluong() {
        return soluong;
    }

    public double getgiatien() {
        return giatien;
    }
}

public class BTT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sach[] danhsachsach = null;
        int n = 0;
        int luachon;

        do {
            System.out.println("\n===== QUAN LY THU VIEN SACH =====");
            System.out.println("1. nhap danh sach n cuon sach");
            System.out.println("2. tinh tong so luong va tong gia tri sach");
            System.out.println("3. tim sach theo ma");
            System.out.println("4. hien thi toan bo danh sach");
            System.out.println("0. thoat chuong trinh");
            System.out.print("hay chon mot chuc nang [0-4]: ");

            luachon = Integer.parseInt(sc.nextLine());

            switch (luachon) {
                case 1:
                    System.out.print("\nnhap so luong loai sach (n): ");
                    n = Integer.parseInt(sc.nextLine());
                    danhsachsach = new sach[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("\n---> nhap thong tin quyen sach thu " + (i + 1) + ":");
                        danhsachsach[i] = new sach();
                        danhsachsach[i].nhapthongtin(sc);
                    }
                    System.out.println("=> nhap danh sach thanh cong!");
                    break;

                case 2:
                    if (danhsachsach == null || n == 0) {
                        System.out.println("(!) danh sach sach chua duoc nhap. vui long chon 1 truoc.");
                    } else {
                        int tongsoluong = 0;
                        double tonggiatri = 0;

                        for (int i = 0; i < n; i++) {
                            tongsoluong += danhsachsach[i].getsoluong();
                            tonggiatri += danhsachsach[i].getsoluong() * danhsachsach[i].getgiatien();
                        }

                        System.out.println("\n----- KET QUA THONG KE -----");
                        System.out.println("tong so luong sach trong thu vien: " + tongsoluong);
                        System.out.printf("tong gia tri cac cuon sach: %,.2f VND\n", tonggiatri);
                    }
                    break;

                case 3:
                    if (danhsachsach == null || n == 0) {
                        System.out.println("(!) danh sach sach chua duoc nhap. vui long chon 1 truoc.");
                    } else {
                        System.out.print("\nnhap ma sach can tim: ");
                        String matim = sc.nextLine();
                        boolean timthay = false;

                        for (int i = 0; i < n; i++) {
                            if (danhsachsach[i].getmasach().equalsIgnoreCase(matim)) {
                                System.out.println("\n-> da tim thay sach:");
                                danhsachsach[i].hienthithongtin();
                                timthay = true;
                                break;
                            }
                        }

                        if (!timthay) {
                            System.out.println("(!) khong tim thay sach co ma: " + matim);
                        }
                    }
                    break;

                case 4:
                    if (danhsachsach == null || n == 0) {
                        System.out.println("(!) danh sach sach trong.");
                    } else {
                        System.out.println("\n----- DANH SACH SACH -----");
                        for (int i = 0; i < n; i++) {
                            danhsachsach[i].hienthithongtin();
                        }
                    }
                    break;

                case 0:
                    System.out.println("da thoat chuong trinh. tam biet!");
                    break;

                default:
                    System.out.println("chuc nang khong hop le, vui long chon lai!");
                    break;
            }
        } while (luachon != 0);

        sc.close();
    }
}