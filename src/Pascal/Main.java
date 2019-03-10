package Pascal;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//        int[][] a = new int[n][n];
//
//        //i用来控制行，j用来控制列
//        for (int i = 0; i < n; i++) {
//            for(int j=0; j<=i; j++){
//                //两种情况，如果是两边的元素，值为1，如果是中间的元素，值位两数之和
//                if(j==0 || i==j){
//                    a[i][j] = 1;
//                }else{
//                    a[i][j] = a[i-1][j-1] + a[i-1][j];
//                }
//            }
//        }
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int a[][] = new int[n][n];

        for(int i=0 ; i<n ; i++){
            for (int j = 0;j<=i;j++) {
                if (j == 0 || i == j) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
