package ErrorTicket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        int[] a = new int[10006];
        int m = 0;
        while (input.hasNextInt()) {
            a[m] = input.nextInt();
            m++;

        }
        Arrays.sort(a, 0, m );
        for (int i = 1; i < m; i++) {
            if (a[i] != a[i - 1] + 1 && a[i] != a[i - 1])// 注意加上限制条件a[i]!=a[i-1]，否则如果重复的数在断点数之前的话就会出错
            {
                System.out.print(a[i] - 1 + " ");
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            if (a[i] == a[i - 1]) {
                System.out.print(a[i]);
                break;
            }
        }

    }
}
