package P3742;

import java.util.Scanner;

/**
 * @author hutao
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String x = cin.next();
        String z = cin.next();

        if (n < 1 || n > 100 || x.length() != n || z.length() != n){
            System.out.println(-1);
            return;
        }
        StringBuilder y = new StringBuilder();
        for (int i = 0; i < n; i++){
            if (x.charAt(i) < z.charAt(i)){
                System.out.println(-1);
                return;
            }
            y.append(z.charAt(i));
        }
        System.out.println(y.toString());
    }
}
