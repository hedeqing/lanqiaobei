package P0505;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        int result=getFactorial(n);
        System.out.println(result);

    }
    static int getFactorial(int N){
        int result=1;
        for(int i=1;i<=N;i++){
            result*=i;
            while(result%10==0){
                result=result/10;
            }
            result=result%1000;
            //如果是对10取余（此时result<10）
            //当i * result 的结果的最右边==0 时
            //其结果的最右边的非0的数字就不仅仅是由result决定
            //比如：当i=15时 ，14！=87178291200  ； 15*12 ！= 15*2
        }

        while(result%10==0){
            result=result/10;
        }
        return result%10;
    }

}