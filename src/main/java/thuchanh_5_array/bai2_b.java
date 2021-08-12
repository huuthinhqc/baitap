package thuchanh_5_array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bai2_b {
    public static void main(String[] args) {
        System.out.println("Nhập số: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Nhập số: ");
        int b = sc.nextInt();
        System.out.println("Nhập số: ");
        int c = sc.nextInt();
        int[] arr = {a,b,c};
        if (isPrimenumber(arr)){
                System.out.println("Mảng toàn số nguyên tố");
            }else{
                System.out.println("Mảng không phải toàn là số nguyên tố");
        }

    }

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


    public static boolean isPrimenumber(int[] arr){
        for(int i=0;i<arr.length;i++){
           if(!isPrimeNumber(arr[i])){
               return false;
             }
        }
        return true;
    }


}
