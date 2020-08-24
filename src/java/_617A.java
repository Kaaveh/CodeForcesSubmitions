package java;

import java.util.Scanner;

public class _617A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int count = 0;

        count+= a/5;
        a-= (a/5)*5;
        if (a == 0){
            System.out.println(count);
        }else {
            count+= a/4;
            a-= (a/4)*4;
            if (a==0){
                System.out.println(count);
            }else {
                count+= a/3;
                a-= (a/3)*3;
                if (a==0){
                    System.out.println(count);
                }else {
                    count+= a/2;
                    a-= (a/2)*2;
                    if (a==0){
                        System.out.println(count);
                    }else {
                        count+= a/1;
                        System.out.println(count);
                    }
                }
            }
        }
    }
}
