package MaximumSubsequenceAnd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []a = new int[7];
        int m = 0 ;
        for (int i =0 ;i<a.length;i++){
            a[i] = scanner.nextInt();
        }
        System.out.println(FindGreatestSumOfSubArray(a));
    }
    public  static int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int currSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            currSum = (currSum < 0) ? array[i] : currSum + array[i];
            if (currSum > maxSum) maxSum = currSum;
        }
        return maxSum;
    }

}
