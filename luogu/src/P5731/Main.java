package P5731;

import java.util.Scanner;

/**
 * @author hutao
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[][] arr = new int[11][11];
        int i = 1;
        int x = 1, y = 0;


        while (i <= n*n){
            while (y < n && arr[x][y+1] == 0) {
                arr[x][++y] = i++;
            }
            while (x < n && arr[x+1][y] == 0) {
                arr[++x][y] = i++;
            }
            while (y > 1 && arr[x][y-1] == 0) {
                arr[x][--y] = i++;
            }
            while (x > 1 && arr[x-1][y] == 0) {
                arr[--x][y] = i++;
            }
        }

        for (int j = 1; j <= n; j++)
        {
            for (int k = 1; k <= n; k++) {
                System.out.printf("%3d", arr[j][k]);
            }
            System.out.println();
        }
    }
}
