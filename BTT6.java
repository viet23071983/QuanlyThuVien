import java.util.ArrayList;
import java.util.Scanner;

class sach {
    private String masach;
    private String tensach;
    private int soluong;
    private double giatien;

    public sach() {}

    public sach(String masach, String tensach, int soluong, double giatien) {
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

    public void setmasach(String masach) {
        this.masach = masach;
    }

    public String gettensach() {
        return tensach;
    }

    public void settensach(String tensach) {
        this.tensach = tensach;
    }

    public int getsoluong() {
        return soluong;
    }

    public void setsoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getgiatien() {
        return giatien;
    }

    public void setgiatien(double giatien) {
        this.giatien = giatien;
    }
}

public class BTT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sach> danhsachsach = new ArrayList<>();
        int luachon;

        // bai 1: demo mang int[] soluong theo yeu cau bai 1
        System.out.println("=== BAI 1: THUC HANH MANG INT[] SOLUONG ===");
        int[] soluong = new int[5];
        int tongsoluongbai1 = 0;
        int maxsoluong = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("nhap so luong cua cuon sach thu " + (i + 1) + ": ");
            soluong[i] = Integer.parseInt(sc.nextLine());
            tongsoluongbai1 += soluong[i];
            if (soluong[i] > maxsoluong) {
                maxsoluong = soluong[i];
            }
        }

        System.out.print("danh sach so luong: ");
        for (int sl : soluong) {
            System.out.print(sl + " ");
        }
        System.out.println("\ntong so luong: " + tongsoluongbai1);
        System.out.println("so luong lon nhat: " + maxsoluong);
        System.out.println("==========================================\n");

        // bai 4: menu hoan chinh
        do {
            System.out.println("\n===== QUAN LY THU VIEN (ARRAYLIST) =====");
            System.out.println("1. them sach");
            System.out.println("2. hien thi sach");
            System.out.println("3. tim sach");
            System.out.println("4. xoa sach");
            System.out.println("5. sua sach");
            System.out.println("6. tinh tong so luong");
            System.out.println("7. tinh tong gia tri");
            System.out.println("8. thoat");
            System.out.print("hay chon mot chuc nang [1-8]: ");

            luachon = Integer.parseInt(sc.nextLine());

            switch (luachon) {
                case 1:
                    System.out.println("\n---> nhap thong tin sach moi:");
                    sach s = new sach();
                    s.nhapthongtin(sc);
                    danhsachsach.add(s);
                    System.out.println("=> them sach thanh cong!");
                    break;

                case 2:
                    if (danhsachsach.isEmpty()) {
                        System.out.println("(!) danh sach sach trong.");
                    } else {
                        System.out.println("\n----- DANH SACH SACH -----");
                        for (sach item : danhsachsach) {
                            item.hienthithongtin();
                        }
                    }
                    break;

                case 3:
                    if (danhsachsach.isEmpty()) {
                        System.out.println("(!) danh sach sach trong.");
                    } else {
                        System.out.print("\nnhap ma sach can tim: ");
                        String matim = sc.nextLine();
                        boolean timthay = false;

                        for (sach item : danhsachsach) {
                            if (item.getmasach().equalsIgnoreCase(matim)) {
                                System.out.println("-> da tim thay sach:");
                                item.hienthithongtin();
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
                    if (danhsachsach.isEmpty()) {
                        System.out.println("(!) danh sach sach trong.");
                    } else {
                        System.out.print("\nnhap ma sach can xoa: ");
                        String maxoa = sc.nextLine();
                        boolean xoathay = false;

                        for (int i = 0; i < danhsachsach.size(); i++) {
                            if (danhsachsach.get(i).getmasach().equalsIgnoreCase(maxoa)) {
                                danhsachsach.remove(i);
                                System.out.println("=> da xoa sach co ma: " + maxoa);
                                xoathay = true;
                                break;
                            }
                        }

                        if (!xoathay) {
                            System.out.println("(!) khong tim thay sach co ma de xoa: " + maxoa);
                        }
                    }
                    break;

                case 5:

                    if (danhsachsach.isEmpty()) {
                        System.out.println("(!) danh sach sach trong.");
                    } else {
                        System.out.print("\nnhap ma sach can sua: ");
                        String masua = sc.nextLine();
                        boolean suathay = false;

                        for (sach item : danhsachsach) {
                            if (item.getmasach().equalsIgnoreCase(masua)) {
                                System.out.println("-> nhap thong tin moi cho sach co ma: " + masua);
                                System.out.print("  + nhap ten sach moi: ");
                                item.settensach(sc.nextLine());
                                System.out.print("  + nhap so luong moi: ");
                                item.setsoluong(Integer.parseInt(sc.nextLine()));
                                System.out.print("  + nhap gia tien moi: ");
                                item.setgiatien(Double.parseDouble(sc.nextLine()));

                                System.out.println("=> cap nhat thong tin sach thanh cong!");
                                suathay = true;
                                break;
                            }
                        }

                        if (!suathay) {
                            System.out.println("(!) khong tim thay sach co ma: " + masua);
                        }
                    }
                    break;

                case 6:
                    if (danhsachsach.isEmpty()) {
                        System.out.println("(!) danh sach sach trong.");
                    } else {
                        int tongsoluong = 0;
                        for (sach item : danhsachsach) {
                            tongsoluong += item.getsoluong();
                        }
                        System.out.println("\ntong so luong tat ca sach: " + tongsoluong);
                    }
                    break;

                case 7:
                    if (danhsachsach.isEmpty()) {
                        System.out.println("(!) danh sach sach trong.");
                    } else {
                        double tonggiatri = 0;
                        for (sach item : danhsachsach) {
                            tonggiatri += item.getsoluong() * item.getgiatien();
                        }
                        System.out.printf("\ntong gia tri tat ca sach: %,.2f VND\n", tonggiatri);
                    }
                    break;

                case 8:
                    System.out.println("da thoat chuong trinh. tam biet!");
                    break;

                default:
                    System.out.println("chuc nang khong hop le, vui long chon lai!");
                    break;
            }
        } while (luachon != 8);

        sc.close();
    }
}