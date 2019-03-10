package Picture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int [][] a = new int[x][y];
        for(int i =0 ;i<y;i++){
            a[0][i] = i;
        }
        for(int i = 0;i<x;i++){
            a[i][0] = i;
        }

        for(int  i = 1;i<x;i++){
            for(int j = 1;j<y;j++){
                a[i][j] = a[i-1][j-1];
            }
        }

        for(int i= 0;i<x;i++){
            for(int j = 0 ;j<y;j++){
                System.out.printf(String.valueOf((char)('A'+a[i][j])));
            }
            System.out.println();
        }
    }
}
