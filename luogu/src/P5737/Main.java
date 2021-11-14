package P5737;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hutao
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        int y = cin.nextInt();

        if (x < 1582 || y > 3000) {
            return;
        }

        int n = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        x += x % 4;
        while (x <= y) {
            if (x % 400 == 0 || x % 100 != 0) {
                n++;
                list.add(x);
            }
            x += 4;
        }

        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", list.get(i));
        }
    }
}
