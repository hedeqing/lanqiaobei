package Fibonacci;

import java.util.Scanner;

public class Main {
        public static void main(String[]args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            //用数组记录第n项的余数
            int[]remainder = new int[n];
            //第一个if是为了确保输入的数据n的取值范围符合题目要求的1 <= n <= 1,000,000
            if (1 <= n && n <= 1000000) {
                if (n == 1 || n == 2) {
                    remainder[n - 1] = 1;
                }else {
                    for (int i = 2;i < n;i++) {
                        remainder[0] = 1;
                        remainder[1] = 1;
                        remainder[i] =(remainder[i - 1] + remainder[i - 2]) % 10007;
                    }
                }
            }
            System.out.println(remainder[n - 1]);
        }
    }