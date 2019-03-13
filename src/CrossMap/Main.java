package CrossMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int n=4*N+5;
        char picture[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                picture[i][j]='.';
            }
        }
        //	biankuang(picture,N,0);
        shizi(picture);
        biankuang(picture,N,0,n-1);//数组，圈数，开始坐标数值，结束坐标数值
        AllPrint(picture);
    }

    public static void biankuang(char[][] picture,int N,int start,int end){
        if(N<1)//N<1表示外圈已全部赋值完毕
            return;
        int nextStart=start+2;
        int nextN=N-1;

        //int end=N*4+5-1;
        //第一行和倒数第一行
        for(int i=start+2;i<=end-2;i++){
            picture[start][i]='$';
            picture[end][i]='$';
        }
        //倒数第二行和第二行
        picture[start+1][start+2]='$';
        picture[start+1][end-2]='$';
        picture[end-1][end-2]='$';
        picture[end-1][start+2]='$';
        //倒数第三行和第三行
        for(int j=start;j<=start+2;j++){
            picture[end-2][j]='$';
            picture[start+2][j]='$';
        }
        for(int j=end;j>=end-2;j--){
            picture[end-2][j]='$';
            picture[start+2][j]='$';
        }
        //两边
        for(int j=start+3;j<=end-3;j++){
            picture[j][start]='$';
            picture[j][end]='$';
        }
        biankuang(picture,nextN,nextStart,end-2);
    }
    public static void shizi(char[][] picture){
        int ZX=(picture.length/2);
        picture[ZX][ZX]='$';
        for(int i=ZX+1;i<=ZX+2;i++){
            picture[ZX][i]='$';
            picture[i][ZX]='$';
        }
        for(int i=ZX-1;i>=ZX-2;i--){
            picture[ZX][i]='$';
            picture[i][ZX]='$';
        }
        return;
    }
    public static void AllPrint(char[][] picture){
        for(int i=0;i<picture.length;i++){
            for(int k=0;k<picture.length;k++){//利用循环输出所有元素
                System.out.print(picture[i][k]);
            }
            System.out.println();
        }

    }
}
