package thuchanh_6_String;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("số từ trong chuỗi: "+ count(s));
    }

    public static int count(String s) {
        int sum = 0;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++){
            if (!arr[i].isEmpty()){
                sum++;
            }
        }
        return sum;
    }
}
