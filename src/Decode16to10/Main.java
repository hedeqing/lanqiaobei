package Decode16to10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = String.valueOf(scanner.next());
        int stringBuffer =Otcdecode(num);
        System.out.println(stringBuffer);
    }
    //16进制转换 10进制

    public  static  int Otcdecode(String str){
        int str_len = str.length();
        double sum = 0 ;
        int  num[] = new int[str_len];
        for (int i=0;i<str_len;i++){
            char n = str.charAt(i);
            switch (n){
                case '0':
                    num[i]= 0;
                    break;
                case '1':
                    num[i]= 1;
                    break;
                case '2':
                    num[i]= 2;
                    break;
                case '3':
                    num[i]= 3;
                    break;
                case '4':
                    num[i]= 4;
                    break;
                case '5':
                    num[i]= 5;
                    break;
                case '6':
                    num[i]= 6;
                    break;
                case '7':
                    num[i]= 7;
                    break;
                case '8':
                    num[i]= 8;
                    break;
                case '9':
                    num[i]= 9;
                    break;
                case 'A':
                    num[i]= 10;
                    break;
                case 'B':
                    num[i]= 11;
                    break;
                case 'C':
                    num[i]= 12;
                    break;
                case 'D':
                    num[i]= 13;
                    break;
                case 'E':
                    num[i]= 14;
                    break;
                case 'F':
                    num[i]= 15;
                    break;
            }
           sum =  sum+ num[i]*Math.pow(16,str_len-i-1);

        }
        return (int) sum;
    }

}





//
//package  Decode16to10;
//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String hex = in.next();
//        long dec_num = Long.parseLong(hex, 16);
//        System.out.println(dec_num);
//    }
//}