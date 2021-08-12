package thuchanh_5_array;

import java.util.Scanner;

public class bai3_a {
    public static void main(String[] args) {
        System.out.println("Nhập số: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Nhập số: ");
        int b = sc.nextInt();
        System.out.println("Nhập số: ");
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        checkNum3a(arr);
    }

    public static void checkNum3a(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++){
            if (((arr[i] % 4 ==0) && (arr[i] % 5 != 0))){
               num = num + 1 ;
            }
        }
        System.out.format("Có %d số chia hết cho 4 và không chia hết cho 5",num);
    }
}