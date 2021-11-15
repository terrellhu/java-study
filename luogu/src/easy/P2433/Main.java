package easy.P2433;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        float p = 3.141593f;
        switch (n) {
            case 1:
                System.out.println("I love Luogu!");
                break;
            case 2:
                System.out.println("6 4");
                break;
            case 3:
                System.out.print("3\n12\n2\n");
                break;
            case 4:
                // 小数点前也是有效数字
                System.out.printf("%.3f\n", 500f/3);
                break;
            case 5:
                System.out.println((220+260)/(12+20));
                break;
            case 6:
                System.out.printf("%.4f\n", new Double(Math.sqrt(6*6+9*9)).floatValue());
                break;
            case 7:
                System.out.print("110\n90\n0\n");
                break;
            case 8:
                System.out.printf("%.4f\n%.4f\n%.3f\n", 2*p*5, p*5.0*5.0, (4.0/3)*p*5*5*5);
                break;
            case 9:
                System.out.println(22);
                break;
            case 10:
                System.out.println(9);
                break;
            case 11:
                System.out.printf("%.4f\n", 100.0/3.0);
                break;
            case 12:
                System.out.println(13);
                System.out.println("R");
                break;
            case 13:
                System.out.printf("%.0f\n", Math.pow((4f/3)*p*4*4*4+(4f/3)*p*10*10*10, 1d/3));
                break;
            case 14:
                // 求解一元二次方程，笔算。。
                System.out.println(50);
                break;

            default:
                break;
        }
    }
}
