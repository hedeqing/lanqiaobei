package PasswordSuspects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0,y = 0;
        x = scanner.nextInt();
        y = scanner.nextInt();
        String []a = new String[x];
        if(y == 0){
            System.out.println("141167095653376");
        }else {
            for(int i = 0;i<y;i++){
                a[i] = scanner.next();
                fullsort(a,0,y,x);

            }
        }
    }
    public  static  void fullsort(String []a,int start,int end,int x){
        if(start == end){

            return ;
        }
        String temp = "";
        for(int j = 0;j<x;j++){
            temp += a[j];
            if(temp.length()==x){
                System.out.println(temp);
            }
            return;
        }
        for(int i = start;i<end;i++){
            swap(a,start,i);
            fullsort(a,start+1,end,x);
            swap(a,start,i);
        }
    }
    public  static  void swap(String []a, int i,int j){
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
