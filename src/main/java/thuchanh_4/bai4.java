package thuchanh_4;

import java.util.Scanner;

public class bai4 {
    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        } else {
            int square = (int) (Math.sqrt(num));
            for (int i = 2; i <= square; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    public static void main(String[] args) {
        System.out.print("Nhập số: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
        }
        System.out.format("Tổng các số nguyên tố nhỏ hơn %d là: %d ",num, sum);
    }


}
