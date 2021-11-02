package P1116;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        int[] t = new int[num];
        for (int i = 0; i < num; i++) {
            t[i] = cin.nextInt();
        }

        int count = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                if (t[j] > t[j+1]){
                    count++;
                    int tmp = t[j];
                    t[j] = t[j+1];
                    t[j+1] = tmp;
                }
            }
        }
        System.out.println(count);
    }
}
