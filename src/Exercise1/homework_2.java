package Exercise1;

import java.util.Scanner;

public class homework_2 {

    public static void main(String[] args) {
        Print_even();
        _9multi9();
        Two_number_addition();

    }

    //  打印10以内的偶数
    public static void Print_even() {
        System.out.println("---打印10以内的偶数---");
        for (int a = 1; a <= 10; a++) {
            if (a % 2 == 0) {
                System.out.println(a + " ");
            }
        }
    }

    //  九九乘法表
    public static void _9multi9() {
        System.out.println("---九九乘法表---");
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                if (i <= j) {
                    System.out.print(i + "×" + j + "=" + i * j + "  ");
                }
            }
            System.out.println(" ");
        }
    }
    // 两数求和
    public static void Two_number_addition() {
        System.out.println("---两数求和---");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}