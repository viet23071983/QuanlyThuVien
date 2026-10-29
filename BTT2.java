import java.util.Scanner;

public class BTT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập họ và tên: ");
        String hoten = sc.nextLine();

        System.out.println("Họ và tên bạn là: " + hoten);

        sc.close();
    }
}


