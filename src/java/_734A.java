package java;

import java.io.IOException;
import java.util.Scanner;

public class _734A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String s = input.nextLine();
        int a = 0;
        int d = 0;

        for (int i=0; i<n; i++){
            if (s.charAt(i) == 'A')
                a++;
            else
                d++;
        }

        if (a>d)
            System.out.println("Anton");
        else if (a<d)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}
