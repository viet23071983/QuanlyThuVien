import java.util.Scanner;

public class BTT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);
        int luachon;

        while (true) {
            System.out.println("\n===== HE THONG QUAN LY THONG TIN SACH =====");
            System.out.println("1. Kiem tra tinh hop le cua sach");
            System.out.println("2. Phan loai gia sach");
            System.out.println("3. Phan loai ton kho");
            System.out.println("4. Chon loai sach ");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban (0-4): ");
            
            luachon = scanner.nextInt();

            switch (luachon) {
                case 1:
                    System.out.println("\n--- KIEM TRA HOP LE ---");
                    System.out.print("Nhap gia sach: ");
                    double gia1 = scanner.nextDouble();
                    System.out.print("Nhap so luong: ");
                    int soluong1 = scanner.nextInt();
                    System.out.print("Nhap nam xuat ban: ");
                    int namxuatban = scanner.nextInt();

                    if (gia1 > 0 && soluong1 >= 0 && namxuatban > 0 && namxuatban <= 2026) {
                        System.out.println("=> Thong tin sach hop le!");
                    } else {
                        System.out.println("=> Thong tin sach KHONG hop le!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- PHAN LOAI GIA SACH ---");
                    System.out.print("Nhap gia sach: ");
                    double gia2 = scanner.nextDouble();

                    if (gia2 < 50000) {
                        System.out.println("=> Sach gia thap");
                    } else if (gia2 <= 100000) {
                        System.out.println("=> Sach gia trung binh");
                    } else if (gia2 <= 200000) {
                        System.out.println("=> Sach gia cao");
                    } else {
                        System.out.println("=> Sach gia dac biet");
                    }
                    break;

                case 3:
                    System.out.println("\n--- PHAN LOAI TON KHO ---");
                    System.out.print("Nhap so luong ton kho: ");
                    int tonKho = scanner.nextInt();

                    if (tonkho == 0) {
                        System.out.println("=> Het sach");
                    } else if (tonkho >= 1 && tonkho <= 5) {
                        System.out.println("=> Sap het");
                    } else if (tonkho >= 6 && tonkho <= 20) {
                        System.out.println("=> Con it");
                    } else if (tonkho > 20) {
                        System.out.println("=> Con nhieu");
                    } else {
                        System.out.println("=> So luong khong hop le!");
                    }
                    break;

                case 4:
                    System.out.println("\n--- CHON LOAI SACH ---");
                    System.out.print("Chon loai sach (1. Sach giao khoa, 2. Sach tham khao, 3. Sach khac,4.Sach khac): ");
                    int loaiSach = scanner.nextInt();

                    switch (loaiSach) {
                        case 1:
                            System.out.println("=> Ban da chon: Sach giao khoa");
                            break;
                        case 2:
                            System.out.println("=> Ban da chon: Sach tham khao");
                            break;
                        case 3:
                            System.out.println("=> Ban da chon: Sach khac");
                            break;
                        default:
                            System.out.println("=> Lua chon khong hop le!");
                            break;
                    }
                    break;

                case 0:
                    System.out.println("Tam biet! Chuong trinh da ket thuc.");
                    scanner.close();
                    return; 

                default:
                    System.out.println("Lua chon khong hop le! Vui long nhap lai tu 0 den 4.");
                    break;
            }
        }
    }
}