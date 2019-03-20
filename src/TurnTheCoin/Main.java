package TurnTheCoin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        char []arr1 = new char[str1.length()];
        char []arr2 = new char[str1.length()];

        arr1 = str1.toCharArray();
        arr2 = str2.toCharArray();

        int index = 0;

        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                index = i;
                break;
            }
        }

        int sum = 0;

        for(int i = index;i<arr1.length;i++){
            if(arr1[i] !=arr2[i]){
                sum++;
                if(arr1[i]!='*'){
                    arr1[i] = '*';
                    if(arr1[i+1]!='*'){
                        arr1[i+1] ='*';
                    }else {
                        arr1[i+1] = 'o';
                    }
                }else {
                    arr1[i] = 'o';
                    if(arr1[i+1]!='*'){
                        arr1[i+1] ='*';
                    }else {
                        arr1[i+1] = 'o';
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
