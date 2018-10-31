package areasOfCircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r ;
        Scanner scanner  = new Scanner(System.in);
        r = scanner.nextInt();
        double pi = 3.14159265358979323;
        double area = Math.pow(r,2)*pi;
        System.out.println(String.format("%.7f", area));

    }
}
