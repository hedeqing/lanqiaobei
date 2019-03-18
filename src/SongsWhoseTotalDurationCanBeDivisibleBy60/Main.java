package SongsWhoseTotalDurationCanBeDivisibleBy60;

import java.util.Scanner;

public class Main {
    public  static  int sum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] time = new int[4];
        for (int i = 0; i < 4; i++) {
            time[i] = scanner.nextInt();
        }
        int num = 0;
        num = numPairsDivisibleBy60(time);
        System.out.println(num);
    }
    public static  int numPairsDivisibleBy60(int[] time) {
        int sum = 0;
        for(int i = 0;i<time.length;i++){
            for(int j = i+1;j<time.length;j++){
                if((time[i]+time[j])%60==0){
                    ++sum;
                }
            }
        }
        return sum;
    }
}
