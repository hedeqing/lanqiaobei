package TheUseOFMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap() ;
        for(int i = 0;i<6;i++){
            map.put(i,i);
        }
        if(map.containsValue(5)){
            System.out.println("map里面有5");
        }
    }
}
