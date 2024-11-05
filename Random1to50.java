package RandomVaFibonacci;

import java.util.Random;
import java.util.Scanner;

public class Random1to50 {

    public static void main(String[] args) {
        Random random = new Random();
        int luckyNumber = random.nextInt(50) + 1;
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n != luckyNumber) {
            System.out.print(" hãy nhập số của bạn: ");
            n = scanner.nextInt();

            if (n < luckyNumber) {
                System.out.println(" so cua ban vua nhap nho hon luckyNumber: ");
            } else if (n > luckyNumber) {
                System.out.println(" so cua ban vua nhap lon hon luckyNumber: ");
            } else {
                System.out.print(" CHUC MUNG !!! so cua ban vua nhap la luckyNumber: " + luckyNumber);
            }

        }

    }

}
