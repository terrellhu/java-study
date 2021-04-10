package P5718;
//https://www.luogu.com.cn/problem/P5718

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int min = 10000;
        //Scanner cin1 = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
            if (min > a[i]){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
