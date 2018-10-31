package decode;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] sts = new String[n+1];
        for(int i=0;i<n;i++){
            sts[i] = scanner.next();
        }
        scanner.close();
        for(int i=0;i<n;i++){
            //将数组解析成二进制字符串 二进制的每四位的结果就是16进制的数字对应，
            String strBinary = toBinary(sts[i]);
            int len_strBin = strBinary.length();
            System.out.println(strBinary+" ");
            //获取二进制字符串长度后需要匹配成8进制数的对应的二进制长度，倍数为3长度，所以需要在前面补充00
            if(len_strBin%3==1) strBinary = "00" + strBinary;
            if(len_strBin%3==2) strBinary = "0" + strBinary;
            System.out.println(strBinary+" ");
            String strOctal = toOctal(strBinary);
            System.out.println(strOctal);
        }

    }

    private static String toOctal(String strBinary) {
        int len = strBinary.length();
        int k;
        //StringBuffer能在后面加字符的优点，不能直接强转，但是可以利用toString（）来转换
        StringBuffer stb = new StringBuffer();
        //切割字符串，前三个为一次计数，前面三个都是0是即是0（0不用显示）
        if(strBinary.substring(0, 3).equals("000")) k=3;
        else k=0;
        for(int i=k;i<len-2;i+=3){
            //切割字符串，每三个为一次计数
            String string = strBinary.substring(i,i+3);
            if(string.equals("000")) stb.append("0");
            else if(string.equals("001")) stb.append("1");
            else if(string.equals("010")) stb.append("2");
            else if(string.equals("011")) stb.append("3");
            else if(string.equals("100")) stb.append("4");
            else if(string.equals("101")) stb.append("5");
            else if(string.equals("110")) stb.append("6");
            else if(string.equals("111")) stb.append("7");
			/*switch (Integer.valueOf(strBinary.substring(i, i+3))) {
			case 000: stb.append("0"); break;
			case 001: stb.append("1"); break;
			case 010: stb.append("2"); break;
			case 011: stb.append("3"); break;
			case 100: stb.append("4"); break;
			case 101: stb.append("5"); break;
			case 110: stb.append("6"); break;
			case 111: stb.append("7"); break;
			default:
				break;
			}*/
        }


        return stb.toString();
    }

    private static String toBinary(String strHex) {
        int len_str = strHex.length();
        StringBuffer stb = new StringBuffer();
        for(int i=0;i<len_str;i++){
            switch (strHex.charAt(i)) {
                case '0': stb.append("0000"); break;
                case '1': stb.append("0001"); break;
                case '2': stb.append("0010");break;
                case '3': stb.append("0011"); break;
                case '4': stb.append("0100"); break;
                case '5': stb.append("0101"); break;
                case '6': stb.append("0110"); break;
                case '7': stb.append("0111"); break;
                case '8': stb.append("1000"); break;
                case '9': stb.append("1001"); break;
                case 'A': stb.append("1010"); break;
                case 'B': stb.append("1011"); break;
                case 'C': stb.append("1100"); break;
                case 'D': stb.append("1101"); break;
                case 'E': stb.append("1110"); break;
                case 'F': stb.append("1111"); break;
                default: break;
            }
        }

        return stb.toString();
    }


//使用jdk内置函数
//public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//    String[] sts = new String[n+1];
//    //先将输入的字符放进字符串数组，后面用valueof提取出来
//    for(int i=0;i<n;i++){
//        sts[i] = scanner.next();
//    }
//    scanner.close();
//
//    for(int i=0;i<n;i++){
//        //获取数据时直接解析为16进制
//        long a = Long.valueOf(sts[i], 16);
//        System.out.println(a);
//        // toBinaryString(i)  //返回i的二进制的字符串表示
//        // toOctalString(i)  //返回i的八进制的字符串表示
//        // toHexString(i)  //返回i的十六进制的字符串表示
//        //toString(i, 10)  //返回i的p进制的字符串表示
//        String b = Long.toOctalString(a);
//        System.out.println(b);
//    }
//
//}
}
