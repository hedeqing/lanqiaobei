package NumbersofTracks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> rs = new ArrayList<>();
        rs.add(1001);
        for (int i = 4;i<36;i++){
            for(int j = 1;j<10;j++)
                for (int k = 0;k<10;k++){

                    if(j*2+k*2 == i){
                            rs.add(j*1000+k*100+k*10+j);

                    }

                }
        }
        Collections.sort(rs);
        for(int l = 0;l<rs.size();l++){
            System.out.println(rs.get(l));
        }
    }
}
