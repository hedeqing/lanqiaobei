package BirthdayCandle;

public class Main {
    public static void main(String[] args) {
        int  n = 0;
        int m = 0;
        int sum = 0;
        for(int  i =1;i<100;i++){
            sum=0;
            for(int j = 0;j<100;j++){
                if(sum>236){
                    continue;
                }else  if(sum==236){
                    System.out.println(i);
                    break;
                }
                m = i+j;
                sum = sum+m;
            }

        }
    }
}
