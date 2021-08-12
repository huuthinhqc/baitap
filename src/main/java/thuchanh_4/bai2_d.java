import java.util.Scanner;

public class bai2_d {
    public static int tinhGiaithua(int num) {
        int giaithua = 1;
        if (num == 0 || num == 1) {
            return 1;
        } else {
            for (int i = 2; i <= num; i++) {
                giaithua *= i;
            }
            return giaithua;
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập số:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.format("Giai thừa của %d là %d", num ,tinhGiaithua(num));
    }

}

