package add;

import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        long n;
        long sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sum=n*(n+1)/2;
        System.out.println(sum);
    }
}
