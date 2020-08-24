package java;

import java.util.Scanner;

public class _580A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] arr = new int[n];
        String[] temp = input.nextLine().split(" ");

        for (int i=0; i<n; i++)
            arr[i] = Integer.parseInt(temp[i]);

        int maxLen = 1;
        int len = 1;

        for (int i=0; i<n-1; i++){
            if (arr[i] <= arr[i+1]) {
                len++;
                if (len > maxLen)
                    maxLen = len;
            }else
                len = 1;
        }
        System.out.println(maxLen);
    }
}