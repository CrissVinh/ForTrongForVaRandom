package RandomVaFibonacci;

import java.util.Scanner;

public class FibonacciSoSauBangTongHaiSotruoc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" nhap so luong cua day so Fibonacci: ");
        int n = scanner.nextInt();

        int soDau = 0, soSau = 1;

        System.out.print(" day Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(soDau + " ");
            int soTiep = soDau + soSau;
            soDau = soSau;
            soSau = soTiep;

        }

    }

}
