package thuchanh_5_array;

import java.util.Scanner;

public class bai2_c {
    public static void main(String[] args) {
        System.out.println("Nhập số: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Nhập số: ");
        int b = sc.nextInt();
        System.out.println("Nhập số: ");
        int c = sc.nextInt();
        int[] arr = {a,b,c};
        if (isArrayincrease(arr)){
            System.out.println("mảng tăng dần");
        }
        else
            System.out.println("mảng không phải tăng dần");
    }

    public static boolean isArrayincrease (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}