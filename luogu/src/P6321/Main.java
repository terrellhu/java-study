package P6321;

import java.util.Scanner;

/**
 * @author hutao
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int zr = scanner.nextInt();
        int zc = scanner.nextInt();

        char[][] arr = new char[r][c];
        for(int i=0; i<r; i++){
            String l = scanner.next();
            for (int j = 0; j < c; j++) {
                arr[i][j] = l.charAt(j);
            }
        }

        char[][] arr2 = new char[r*zr][c*zc];
        for(int i=0; i<r*zr; i++){
            for(int j=0; j < c*zc; j++){
                arr2[i][j] = arr[i/zr][j/zc];
                System.out.print(arr2[i][j]);
            }
            System.out.println("");
        }
    }
}
