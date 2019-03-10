package SpecialNumberofTracts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> rs = new ArrayList<Integer>();
        for(int i = 1;i<10;i++)
            for(int j = 0;j<10;j++)
                for(int k = 0;k<10;k++)
                {
                    if(2*i+2*j+k==n)
                        rs.add(i*10000+j*1000+k*100+j*10+i);
                    if(2*i+2*j+2*k==n)
                        rs.add(i*100000+j*10000+k*1000+k*100+j*10+i);

                }

        Collections.sort(rs);

        for(int i = 0; i<rs.size();i++)
        {
            System.out.println(rs.get(i));
        }

    }


}
