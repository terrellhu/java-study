package P4327;

import java.util.Scanner;

/**
 * @author hutao
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        String line = cin.next();
        if (line.length() > 15 || line.isEmpty()) {
            return;
        }

        String line1 = "..#...#...*...#...#...*...#...#...*...#...#...*...#...#...*..";
        String line2 = ".#.#.#.#.*.*.#.#.#.#.*.*.#.#.#.#.*.*.#.#.#.#.*.*.#.#.#.#.*.*.";
        String line3 = "#.@.#.@.*.@.*.@.#.@.*.@.*.@.#.@.*.@.*.@.#.@.*.@.*.@.#.@.*.@.*";

        int len = line.length();
        System.out.println(line1.substring(0, len * 4 + 1));
        System.out.println(line2.substring(0, len * 4 + 1));
        String l = line3.substring(0, len * 4);
        if (len % 3 == 0){
            l = l + "*";
        }
        else{
            l = l + "#";
        }
        for (int i = 0; i < len; i++) {
            l = l.replaceFirst("@", line.substring(i, i + 1));
        }
        System.out.println(l);
        System.out.println(line2.substring(0, len * 4 + 1));
        System.out.println(line1.substring(0, len * 4 + 1));
    }
}
