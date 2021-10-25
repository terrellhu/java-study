package P2084;

import java.util.Scanner;

/**
 * @author hutao
 * https://www.luogu.com.cn/problem/P2084
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String m = cin.next();
        String n = cin.next();

        int i = n.length();
        int j = 0;
        StringBuilder ret = new StringBuilder();
        for (; i > 0; i--) {
            if (n.charAt(j) != '0') {
                ret.append(String.valueOf(n.charAt(j))).append("*").append(m).append("^").append(String.valueOf(i - 1)).append("+");
            }
            j++;
        }
        String out = ret.substring(0, ret.length()-1);
        System.out.println(out);
    }
}
