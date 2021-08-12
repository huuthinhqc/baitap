package thuchanh_4;

import java.util.Scanner;

public class bai5 {
        public static void main(String[] args) {
            int num, reverse = 0, original;
            System.out.print("Nhập số:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            original = num;
            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }
            System.out.format("Số đảo ngược của %d là: %d ", original, reverse);
        }
    }
