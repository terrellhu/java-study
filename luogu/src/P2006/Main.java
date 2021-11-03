package P2006;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author hutao
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] s = new int[m][2];

        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            s[i][0] = scanner.nextInt();
            s[i][1] = scanner.nextInt();

            // 必杀
            if (s[i][0] == 0 && s[i][1] > 0){
                ret.add(i+1);
            }
            else if (s[i][0] > 0 && s[i][1] > 0){
                if (k / s[i][0] * s[i][1] >= n){
                    ret.add(i+1);
                }
            }
        }

        if (ret.isEmpty()){
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (Integer i : ret ) {
            sb.append(i);
            sb.append(" ");
        }
        String out = sb.substring(0, sb.length()-1);
        System.out.println(out);
    }
}
