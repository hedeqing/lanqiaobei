package SearchInt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int [] a = new int[num];
        for(int i = 0;i<num;i++){
            a[i] = scanner.nextInt();
        }
        int situation = -1;
        int sea_num = scanner.nextInt();
        for(int i = 0;i<num;i++){
            if(a[i ] == sea_num){
                situation = i+1;
                break;
            }
        }
        System.out.println(situation);
    }
}
