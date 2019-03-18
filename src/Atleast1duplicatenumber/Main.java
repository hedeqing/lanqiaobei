package Atleast1duplicatenumber;

import java.util.Scanner;

import static CutLattice.Main.num;

public class Main {
   private static int value = 0;
    private static boolean[] taken = new boolean[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(numDupDigitsAtMostN(n));
    }
    public static int numDupDigitsAtMostN(int N) {
        return N - all_different(N) + 1;
    }
    public  static int all_different(int N){
        rec(0, 0, N);
        return value;
    }
    public  static void rec(long num, int dig, int N){
        if(num > N) return;
        value += 1;
        for(int x = 0; x < 10; x += 1){
            if(taken[x]) continue;
            if(dig + x == 0) continue;
            taken[x] = true;
            rec(num * 10 + x, dig + 1, N);
            taken[x] = false;
        }
    }
}
