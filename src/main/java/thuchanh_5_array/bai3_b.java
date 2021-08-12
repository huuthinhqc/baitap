package thuchanh_5_array;

import java.util.Scanner;

public class bai3_b {
    public static void main(String[] args) {
        System.out.println("Nhập số: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Nhập số: ");
        int b = sc.nextInt();
        System.out.println("Nhập số: ");
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        sumPrimenumber(arr);
    }

    public static void sumPrimenumber(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(bai2_b.isPrimeNumber(arr[i])){
                sum = sum + arr[i];
            }
        }
        System.out.format("Tổng các số nguyên tố trong mảng là: %d",sum);;
    }

}
