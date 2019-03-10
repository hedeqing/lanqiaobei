package Numberofbriquettes;

public class Main {
    public static void main(String[] args) {
        int  sum =0;
        int n = 0;
        for(int  i = 1;i<=100;i++){
            n+=i;
            sum+=n;
        }
        System.out.println(sum);
    }
}
