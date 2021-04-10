package P5725;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();

        // 输出矩形
        for (int i = 0,j = 1; i < x*x; i++) {
            System.out.printf("%02d", j);
            if (j % x == 0){
                System.out.println();
            }
            j++;
        }
        System.out.println();

        //输出三角形
        for(int i = x, j = 1, k = 1; i > 0; i--){
            for (int l = 0; l < x-k; l++) {
                System.out.print("  ");
            }
            for (int l = 0; l < k; l++) {
                System.out.printf("%02d", j);
                j++;
            }
            k++;
            System.out.println();
        }
    }
}
