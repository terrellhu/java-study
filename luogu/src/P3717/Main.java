package P3717;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int r = cin.nextInt();
        int[][] ms = new int[m][2];
        for (int i = 0; i < m; i++) {
            ms[i][0] = cin.nextInt();
            ms[i][1] = cin.nextInt();
        }

        int[][] area = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            double d;
            for (int j = 1; j < n+1; j++) {
                for (int k = 1; k < n+1; k++){
                    d = Math.sqrt((ms[i][0]-j)*(ms[i][0]-j) + (ms[i][1]-k)*(ms[i][1]-k));
                    if (d <= r){
                        area[j][k]++;
                    }
                }
            }
        }

        int total = 0;
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n+1; j++){
                if (area[i][j] > 0) {
                    total += 1;
                }
            }
        }

        System.out.println(total);
    }
}
