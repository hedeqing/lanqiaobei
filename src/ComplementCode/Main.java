package ComplementCode;

import java.util.Scanner;

public class Main {
    public  static  int X= 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        X= scanner.nextInt();
        System.out.println(bitwiseComplement(X));
    }
    public  static int bitwiseComplement(int N) {
        Long x = Long.valueOf(N);
        String new_x= x.toString(x,2);

       // System.out.println(new_x);
        StringBuffer stringBuffer = new StringBuffer();

        for(int i =0 ;i< new_x.length();i++){
            switch (new_x.charAt(i)){
                case '0' :
                    stringBuffer.append(1);
                    break;
                case '1':
                    stringBuffer.append(0);
                    break;
            }
        }
        String new_string = "";
        new_string = stringBuffer.toString();

        int sum = 0;

        for(int i = 0;i<new_string.length();i++){
            if(new_string.charAt(i) =='1'){
                sum += Math.pow(2,new_string.length()-i-1);
                continue;
            }else {
                sum+=0;
                continue;
            }
        }
        return sum;
    }
}
