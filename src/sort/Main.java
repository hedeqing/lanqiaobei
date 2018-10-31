package sort;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int []a = new int[n];
        int b;

        for(int i=0;i<n;i++){
            b =scanner.nextInt();
            a[i] = b;
        }
        sort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public  static  void sort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
    }
}
