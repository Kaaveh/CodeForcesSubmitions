package java;

import java.util.Scanner;

public class _677A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int max= input.nextInt();
        input.nextLine();
        int width= num;
        int temp;

        for (int i=0; i<num; i++){
            temp= input.nextInt();
            if (temp>max)
                width++;
        }
        System.out.println(width);
    }
}
