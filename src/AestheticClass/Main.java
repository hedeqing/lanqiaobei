package AestheticClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a[][] = new int[x][y];

        int  [][]b = new int[x][y];

        for(int i =0 ;i<x;i++){
            for(int j =0 ;j<y;j++) {
                b[i][j] = 1;
            }
        }
        for(int i =0 ;i<x;i++){
            for(int j =0 ;j<y;j++){
                a[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;

        for(int i =0 ;i< x;i++){
            for(int k = i+1;k<x;k++){
                for(int j = 0;j<y;j++){
                    if((a[i][j] + a[k][j])==1){
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum/y);
//        int  i = 1;
//        int [] b = new int[]{1,1,1,1};
//        for(int j = 0;j<y;j++){
//            System.out.printf((a[0][j] + a[1][j])" ");
//        }

    }
//    public static void taste(int[][] array,int kid,int picture) {
//        int count=0;
//        for(int i=0;i<kid;i++) {
//            int temp=1;
//            while(temp+i<kid) {
//                boolean juge=true;
//                for(int j=0;j<picture;j++) {
//                    if(array[i][j]+array[i+temp][j]==1) {
//                        continue;
//                    }else {
//                        juge=false;
//                        break;
//                    }
//                }
//                if(juge) {
//                    count++;
//                }
//                temp++;
//            }
//
//        }
//        System.out.println(count);
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int kid = scanner.nextInt();
//        int picture = scanner.nextInt();
//        int[][] array = new int[kid][picture];
//        for (int i = 0; i < kid; i++) {
//            for (int j = 0; j < picture; j++) {
//                array[i][j] = scanner.nextInt();
//            }
//        }
//        taste(array, kid, picture);
//
//
//    }
}
