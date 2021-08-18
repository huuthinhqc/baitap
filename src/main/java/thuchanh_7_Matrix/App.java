package thuchanh_7_Matrix;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int[][] a = inputMatrix();

        // Bài 1
        System.out.print("nhập x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (findX(a, x)) {
            System.out.format("có xuất hiện giá trị x = %d trong mảng", x);

        } else {
            System.out.format("không xuất hiện giá trị x= %d trong mảng", x);
        }

        // Bài 2
        if (checkPrime(a)) {
            System.out.println("Mảng toàn số nguyên tố");
        } else System.out.println("Mảng không phải toàn số nguyên tố");

        // Bài 3
        int max = findMax(a);
        System.out.format("Max là %d", max);
    }

    public static int[][] inputMatrix() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Số dòng: ");
        int r = scan.nextInt();

        System.out.print("Số cột: ");
        int c = scan.nextInt();

        int[][] ret = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("a[%d][%d] = ", i, j);
                ret[i][j] = scan.nextInt();
            }
        }

        return ret;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                System.out.format("5%d ", a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int r, int c, int min, int max) {
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = (int) Math.floor(Math.random() * (max - min) + min);
            }
        }
        return ret;
    }

    public static int sumElements(int[][] a) {
        int s = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a.length; j < c; j++) {
                s += a[i][j];
            }
        }
        return s;
    }

    public static boolean findX(int[][] a, int x) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (x == a[i][j]) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean isPrime(int n) {
        boolean num = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                num = false;
                break;
            }
        }
        return num;
    }

    public static boolean checkPrime(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (!isPrime(a[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findMax(int[][] a) {
        int max = a[0][0];
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }


}