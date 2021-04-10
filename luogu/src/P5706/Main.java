package P5706;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double l = cin.nextDouble();
        int n = cin.nextInt();

        System.out.printf("%.3f\n", l/n);
        System.out.println(n*2);
    }
}
