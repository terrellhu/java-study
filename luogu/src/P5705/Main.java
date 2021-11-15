package P5705;

import java.util.Scanner;
/**
 * @author hutao
 */
public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String s = cin.next();

        System.out.println(new StringBuilder(s).reverse().toString());
    }
}
