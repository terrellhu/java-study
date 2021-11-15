package easy.P1425;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int h1 = cin.nextInt();
        int m1 = cin.nextInt();
        int h2 = cin.nextInt();
        int m2 = cin.nextInt();

        if (m2 < m1){
            h2--;
            m2 += 60;
        }
        System.out.printf("%d %d\n", h2-h1, m2-m1);
    }
}
