package thuchanh_4;

import java.util.Scanner;

public class bai2_e {
    public static int tinhGiaithuacua1so(int num) {
        int giaithua = 1;
            for (int i = 1; i <= num; i++) {
                giaithua *= i;
            }
            return giaithua;
        }

    public static int tinhtongGiaithua(int num) {
        int tonggiaithua = 0;
        for (int i = 1; i <= num; i++) {
            tonggiaithua = tonggiaithua + tinhGiaithuacua1so(i);
        }
        return tonggiaithua;
    }


    public static void main(String[] args) {
        System.out.print("Nhập số:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.format("Tổng giai thừa của các số từ 1 đến %d là %d", num ,tinhtongGiaithua(num));
    }

}


