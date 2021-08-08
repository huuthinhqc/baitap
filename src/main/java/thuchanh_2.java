import java.util.Locale;
import java.util.Scanner;
import static java.lang.Character.*;
import java.lang.Math;

public class thuchanh_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bài 1: Nhập 1 số bất kì, đọc giá trị của số nguyên đó nếu nó từ 1->9, ngược lại báo không đọc được

//        System.out.print("Nhap a: ");
//        int a_int = input.nextInt();
//
//        if (a_int == 1) {
//            System.out.println("Một");
//        }
//        else if (a_int == 2) {
//            System.out.println("Hai");
//        }
//        else if (a_int == 3) {
//            System.out.println("Ba");
//        }
//        else if (a_int == 4) {
//            System.out.println("Bốn");
//        }
//        else if (a_int == 5) {
//            System.out.println("Năm");
//        }
//        else if (a_int == 6) {
//            System.out.println("Sáu");
//        }
//        else if (a_int == 7) {
//            System.out.println("Bảy");
//        }
//        else if (a_int == 8) {
//            System.out.println("Tám");
//        }
//        else if (a_int == 9) {
//            System.out.println("Chín");
//        }
//        else
//            System.out.println("Không đọc được");

        //Bài 2: Nhập một chữ cái, chữ thường đổi sang chữ hoa,chữ hoa thì đổi sang chữ thường
//        System.out.print("Nhập chữ cái: ");
//        String chucai = input.nextLine();
//        if (isUpperCase(chucai.charAt(0))){
//            System.out.println(toLowerCase(chucai.charAt(0)));
//        }
//            else
//             System.out.println(toUpperCase(chucai.charAt(0)));

        // Bài 3: Giải phương trình bậc nhất ax + b = 0
//        int a, b;
//        double nghiem;
//
//        System.out.println("Nhập số a: ");
//        a = input.nextInt();
//        System.out.println("Nhập số b: ");
//        b = input.nextInt();
//        System.out.println("Phương trình: " + a + "x + " + b + " = 0");
//        if (a == 0) {
//            if (b == 0) {
//                System.out.println("Phương trình vô số nghiệm.");
//            } else {
//                System.out.println("Phương trình vô nghiệm.");
//            }
//        } else {
//            nghiem = (double) -b / a;
//            System.out.println("Phương trình có nghiệm x = " + nghiem);
//        }

        //Bài 4: Giải phương trình ax^2+ bx + c = 0
//            System.out.println("Nhập số a: ");
//            float a = input.nextFloat();
//            System.out.println("Nhập số b: ");
//            float b = input.nextFloat();
//            System.out.println("Nhập số c: ");
//            float c = input.nextFloat();
//        System.out.println("Phương trình: " + a + "x^2 + " + b + "x + " + c + " = 0");
//
//            if (a == 0) {
//                if (b == 0) {
//                    System.out.println("Phương trình vô nghiệm");
//                } else {
//                    System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
//                }
//
//            }
//            float delta = b*b - 4*a*c;
//            float x1;
//            float x2;
//            if (delta > 0) {
//                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
//                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
//                System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
//            } else if (delta == 0) {
//                x1 = (-b / (2*a));
//                System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
//            } else {
//                System.out.println("Phương trình vô nghiệm!");}


        //Bài 5 : Nhập 4 số nguyên a, b, c,c. Tìm min
//        System.out.println("Nhập số a: ");
//        int a = input.nextInt();
//        System.out.println("Nhập số b: ");
//        int b = input.nextInt();
//        System.out.println("Nhập số c: ");
//        int c = input.nextInt();
//        System.out.println("Nhập số d: ");
//        int d = input.nextInt();
//        if (a <= b && a <= c && a<=d) {
//            System.out.println("Min trong 4 số là "+ a);
//        }
//        else if (b <= c && b<=d) {
//            System.out.println("Min trong 4 số là "+ b);
//        }
//        else if (c <=d) {
//            System.out.println("Min trong 4 số là "+ c);
//        }
//        else
//            System.out.println("Min trong 4 số là "+ d);


        // Bài 6: Nhập 4 số nguyên a,b,c,d. Sắp xếp theo thứ tự tăng dần


        // Bài 7: Tính tiền đi taxi từ số km nhập vào. Biết:
        //1km đầu giá 15000đ
        //từ km2 đến km thứ 5 giá 13500đ
        //từ km thứ 6 trở đi giá 11000đ
        //nếu trên 120km trở lên giảm 10% tổng tiền
//        System.out.println("Nhập số km: ");
//        double a = input.nextDouble();
//
//        if (a <= 1) {
//            System.out.println("Tiền taxi là 15000đ");
//        } else if (1 < a && a <= 5) {
//            System.out.println("Tiền taxi là " + a * 13500 + "đ");
//        } else if (5 < a && a <= 120) {
//            System.out.println("Tiền taxi là " + a * 11000 + "đ");
//        } else
//            System.out.println("Tiền taxi là " + ((a * 11000) - (0.1 * a)) + "đ");


        // Bài 8: Nhập vào tháng và năm. Cho biết tháng đó có bao nhiêu ngày



        // Bài 9: Nhập độ dài 3 cạnh. Kiểm tra đó có phải tam giác không, tam giác gì
            System.out.println("Nhập cạnh a: ");
            double a = input.nextDouble();
            System.out.println("Nhập cạnh b: ");
            double b = input.nextDouble();
            System.out.println("Nhập cạnh c: ");
            double c = input.nextDouble();

            if ((a>b+c) || (b>a+c) || (c>a+b)) {
                System.out.println("Đây không phải là 3 cạnh của 1 tam giác");
            }   else if ((a==b) && (a==c)){
                System.out.println("Đây là tam giác đều");
            }   else if ((a==b) || (b==c) || (a==c)){
                System.out.println("Đây là tam giác cân");
            }   else if ((a*a==b*b+c*c) || (b*b==a*a+c*c) || (c*c==b*b+a*a)){
                System.out.println("Đây là tam giác vuông");
            }   else
                System.out.println("Đây là tam giác thường");





        }
    }

