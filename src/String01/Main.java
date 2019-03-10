package String01;

public class Main {
    public static void main(String[] args) {
         for(int i =0;i<32;i++){
             Long a = Long.valueOf(i);
             if(i<2){
                 System.out.println("0000"+a.toString(i,2));
             }else if(i<4){
                 System.out.println("000"+a.toString(i,2));
             }else  if(i<8){
                 System.out.println("00"+a.toString(i,2));
             }else if(i<16){
                 System.out.println("0"+a.toString(i,2));
             }else if(i<32){
                 System.out.println(a.toString(i,2));
             }
         }
    }
}
