package main;

import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println(sum(sc.nextLine()));
    }
    static  int sum(String A){
        int ans=0;
        String[] res = A.split("[,]",0);
        for(int i=0;i< res.length;i++){
            ans+=Integer.parseInt(res[i]);
        }
        return ans;
    }
}
