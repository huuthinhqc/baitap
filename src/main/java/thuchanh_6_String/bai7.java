package thuchanh_6_String;

import java.util.Locale;
import java.util.Scanner;

public class bai7 {
    public static void main(java.lang.String[] args) {
        // bai 7: Đếm số lượng ký tự nguyên âm và phụ âm xuất hiện trong chuỗi. Ví dụ chuỗi java có 2 nguyên âm a, 2 phụ âm j và v.

        System.out.print("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        count(s);
    }

    public static void count(String s) {
        int nguyenam = 0, phuam = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                nguyenam++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                phuam++;
            }
        }
        System.out.println("Số nguyên âm: " + nguyenam);
        System.out.println("Số phụ âm: " + phuam);

    }
}