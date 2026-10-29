import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Nhap thong tin sach: ");
        System.out.print("Nhập mã sách: ");
        String masach = scanner.nextLine();

        System.out.print("Nhập tên sách: ");
        String tensach = scanner.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacgia = scanner.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namxuatban = scanner.nextInt();

        System.out.print("Nhập đơn giá: ");
        double dongia = scanner.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soluong = scanner.nextInt();


        double thanhtien = dongia * soluong;

    
        double phivanchuyen = 0.05 * thanhtien;


        double tongtiennhap = thanhtien + phivanchuyen;


        System.out.println("\n Thông tin giá sách và giá trị nhập kho");
        System.out.println("Mã sách: " + masach);
        System.out.println("Tên sách: " + tensach);
        System.out.println("Tác giả: " + tacgia);
        System.out.println("Năm xuất bản: " + namxuatban);
        System.out.printf("Đơn giá: %,.2f\n", dongia);
        System.out.println("Số lượng: " + soluong);
        System.out.println("----------------------------------------------");
        System.out.printf("Thành tiền : %,.2f\n", thanhtien);
        System.out.printf("Phí vận chuyển : %,.2f\n", phivanchuyen);
        System.out.printf("TỔNG TIỀN NHẬP : %,.2f\n", tongtiennhap);

        scanner.close();
    }
}
}