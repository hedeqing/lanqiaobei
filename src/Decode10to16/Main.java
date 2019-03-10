package Decode10to16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        Long ten_num = Long.valueOf(n);
        System.out.println(ten_num.toString(ten_num,16).toUpperCase());
    }
}
