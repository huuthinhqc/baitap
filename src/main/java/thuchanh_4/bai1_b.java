import java.util.Scanner;

public class bai1_b {
    static boolean kiemtrasochinhphuong(double num)
    {
        double sq = Math.sqrt(num);
        return ((sq - Math.floor(sq)) == 0);
    }
    public static void main(String[] args)
    {
        System.out.print("Nhập số:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if (kiemtrasochinhphuong(num))
            System.out.format("%.0f là số chính phương",num);
        else
            System.out.format("%.0f không phải là số chính phương",num);

    }
}
