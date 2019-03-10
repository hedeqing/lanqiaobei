package MaxMinSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = scanner.nextInt();
        }

        int max = a[0],min = a[0],sum = 0;
        for(int i = 0;i<n;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
            sum+= a[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
