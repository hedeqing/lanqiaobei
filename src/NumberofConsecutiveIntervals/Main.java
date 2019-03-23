package NumberofConsecutiveIntervals;


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=reader.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int s=i;s<arr.length;s++)
            {
                if(max<arr[s])
                    max=arr[s];
                if(min>arr[s])
                    min=arr[s];
                if(max-min==s-i)
                    count++;
            }
        }
        System.out.println(count);
    }
}