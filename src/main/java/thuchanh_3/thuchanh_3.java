package thuchanh_3;

import java.lang.Math;
import java.util.Scanner;

public class thuchanh_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //Bài 1 : Viết chương trình xét 1 năm có phải năm nhuận hay không?
        //Năm nhuận là năm chia hết cho 400 hoặc chia hết cho 4 đồng thời không chia hết cho 100.

        System.out.println("Nhập năm: ");
        int a = input.nextInt();
        if (((a % 400 == 0)|| (a % 4 ==0)) && (a % 100 != 0)) {
            System.out.println("Năm nhuận");

        }else
            System.out.println("Không phải năm nhuận");


        }
}
