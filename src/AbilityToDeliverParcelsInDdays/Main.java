package AbilityToDeliverParcelsInDdays;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int[] weights = new int[6];
        for (int i = 0; i < 6; i++) {
            weights[i] = scanner.nextInt();
        }
        System.out.println(shipWithinDays(weights, d));
    }

    private static int shipWithinDays(int[] weights, int d) {
        int left= weights[0];
        int right = 0;
        int mid = 0;
        for(int i = 0;i<weights.length;i++){
            left = Math.max(left,weights[0]);
            right+= weights[i];
        }
        while (left<right){
            mid = (left+right)/2;
            if(can(weights,mid,d)){
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return  left;
    }

    private static boolean can(int[] weights, int mid, int d) {
        int ans = 1;
        int max =0 ;
        for(int i = 0;i<weights.length;i++){
            if(weights[i]+max>mid){
                ans+=1;
                max = 0;
            }
            max+= weights[i];
        }
        return ans<= d;
    }


//    /**
//     * 利用二分法求得最佳的权重，左边界是数组的最大值，右边界是数组的总和，减少运算。
//     * @param weights
//     * @param D
//     * @return
//     */
//    public static int shipWithinDays(int[] weights, int D) {
//        int left= weights[0];
//        int  right = 0;
//        for(int i = 0;i<weights.length;i++)
//        {
//
//            left = Math.max(weights[i],left);
//            right += weights[i];
//        }
//        while (left < right) {
//            int mid= (right + left) / 2;
//            if (can(weights, D, mid))
//            {
//                right = mid;
//            }
//            else
//            {
//                left = mid + 1;
//            }
//        }
//        return left;
//    }
//
//    /**
//     * 当前面加起来的权重大于容量时，天数加一，即ans+1，然后权值重置为0，，，，
//     * @param weights 权重
//     * @param D  天数
//     * @param cap 容量
//     * @return
//     */
//    public static boolean can(int[] weights, int D, int cap)
//    {
//        int max = 0;
//        int ans = 1;
//        for(int i = 0;i<weights.length;i++)
//        {
//            if(max + weights[i] > cap)
//            {
//                ans += 1;
//                max = 0;
//            }
//            max += weights[i];
//        }
//        return ans <= D;
//    }
}