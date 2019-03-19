package TurnTheCoin;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str1,str2;
//        str1 = in.nextLine();
//        str2 = in.nextLine();
//
//        //定义两个固定长度的字符数组
//        char arr1[] = new char[str1.length()];
//        char arr2[] = new char[str1.length()];
//
//        //字符串转化为字符数组
//        arr1 = str1.toCharArray();
//        arr2 = str2.toCharArray();
//        int index = 0;
//        int sum=0;
//
//        //找到两个字符数组中第一个不同元素的位置
//        for(int a=0;a<arr1.length;a++) {
//            if(arr1[a] != arr2[a]) {
//                index = a;
//                break;
//            }
//        }
//
//        //从第一个不同位置的元素开始转换
//        for(int a=index;a<arr1.length;a++) {
//            if(arr1[a] != arr2[a]) {
//                //记录转换了几次
//                sum++;
//                if(arr1[a] != '*') {
//                    arr1[a] ='*';
//                    if(arr1[a+1] != '*') {
//                        arr1[a+1] = '*';
//                    }else {
//                        arr1[a+1] = 'o';
//                    }
//                }else {
//                    arr1[a] = 'o';
//                    if(arr1[a+1] != '*') {
//                        arr1[a+1] = '*';
//                    }else {
//                        arr1[a+1] = 'o';
//                    }
//                }
//            }
//        }
//        //输出翻硬币的总次数
//        System.out.println(sum);
//    }
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
