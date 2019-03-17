package WithScore;

import java.util.*;

public class Main {

    static int n, result;

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        sc.close();
//
//        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        allsort(data, 0);
//        System.out.println(result);
//    }
//
//    private static int split(int[] data, int j, int k) {
//
//        int num = 0;
//        for (int i = j; i < k; i++) {
//            num = data[i] + num * 10;
//        }
//        return num;
//    }
//
//    public static void allsort(int[] data, int i) {
//
//        if (i == data.length) {
//
//            for (int j = 1; j < data.length; j++) {
//                for (int k = j + 1; k < data.length; k++) {
//                    int pre = split(data, 0, j);
//                    int mid = split(data, j, k);
//                    int fon = split(data, k, 9);
//                    if (mid % fon != 0)
//                        continue;
//                    if (pre + mid / fon == n)
//                        result++;
//                }
//            }
//            return;
//        }
//
//        for (int j = i; j < data.length; j++) {
//
//            int temp = data[j];
//            data[j] = data[i];
//            data[i] = temp;
//
//            allsort(data, i + 1);
//
//            temp = data[j];
//            data[j] = data[i];
//            data[i] = temp;
//        }

        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        fullsort(a,0,9);


    }

    public static void fullsort(int[] a, int start, int end) {
        if (start == end) {
            return;
        }
        for (int i = start; i < end; i++) {
            swap(a, start, i);
            fullsort(a, start + 1, end);
            swap(a, start, i);
        }
//        for (int j = 1; j < a.length; j++) {
//                for (int k = j + 1; k < a.length; k++) {
//                    int pre = spilt(a, 0, j);
//                    int mid = spilt(a, j, k);
//                    int fon = spilt(a, k, 9);
//                    if (mid % fon != 0)
//                        continue;
//                    if (pre + mid / fon == n)
//                        result++;
//                }
//            }
    }

    public  static  int spilt(int []a,int i,int j){
        int n = 0;
        for(int k = i;k<j;k++){
            n = a[i] + n * 10;
        }
        return  n;
    }

    public static void swap(int[] a, int i, int j) {
        int temp=0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
