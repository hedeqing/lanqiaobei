package PrimeFactor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();

        long ans = 1;
        long x = n;
        for(long i = 2; i <= x; i++) {
            if(x % i == 0) {
//			if(x % i == 0 && isPrime(i)) {
                ans *= i;
            }
            while(x % i == 0) {
                x /= i;
            }
        }
        System.out.println(ans);
    }

}
