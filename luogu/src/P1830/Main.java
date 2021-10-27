package P1830;

import java.util.Scanner;

/**
 * @author hutao
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int x = cin.nextInt();
        int y = cin.nextInt();

        int[][] rs = new int[x][4];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 4; j++) {
                rs[i][j] = cin.nextInt();
            }
        }

        int[][] ps = new int[y][2];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < 2; j++) {
                ps[i][j] = cin.nextInt();
            }
        }

        int[][] ret = new int[y][3];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (ps[j][0] >= rs[i][0] && ps[j][0] <= rs[i][2] && ps[j][1] >= rs[i][1] && ps[j][1] <= rs[i][3]) {
                    ret[j][0] = 1;
                    ret[j][1] += 1;
                    ret[j][2] = i + 1;
                }
            }
        }

        for (int i = 0; i < y; i++){
            if (ret[i][0] == 1){
                System.out.printf("%c %d %d\n", ret[i][0] == 0 ? 'N' : 'Y', ret[i][1], ret[i][2]);
            }else {
                System.out.println('N');
            }
        }
    }
}
