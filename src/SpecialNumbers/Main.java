package SpecialNumbers;

public class Main {
    public static void main(String[] args) {
        for(int i=100;i<999;i++){
            int n = i/100;
            int m = (i-n*100)/10;
            int  l = i%10;
            int sum = (int) (Math.pow(n,3)+Math.pow(m,3)+Math.pow(l,3));
            if(i == sum){
                System.out.println(i);
            }
        }
    }
}
