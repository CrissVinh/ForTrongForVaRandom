package WhileVaFor;

import java.util.Scanner;

public class BangCuuChuongFOR {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap ten cua bang cuu chuong ban muon xem: ");

        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(n + " * " + i + " = ");
            int dapAn = n * i;
            System.out.println(dapAn);
        }

    }

}
