package P6202;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1){
            System.out.println(0);
            return;
        }
        if (n == 2){
            System.out.println(1);
            return;
        }
        if (n==4){
            System.out.println(2);
            return;
        }
        int score = 0;
        while(n != 4){
            if ((n&1) != 1){
                n = n>>1;
            }else {
                n = n+(n<<1)+1;
            }
            score++;
        }
        score+=2;
        System.out.println(score);
    }
}
