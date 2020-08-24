package java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class _479A {
    public static void main(String[] args) {
        MyScanner input = new MyScanner();
        ArrayList num = new ArrayList();

        int a= input.kint();
        int b= input.kint();
        int c= input.kint();

        num.add(a+b+c);
        num.add((a+b)*c);
        num.add(a*(b+c));
        num.add(a*b*c);
        num.add(a*b+c);
        num.add(a+b*c);

        Collections.sort(num);

        System.out.println((int) num.get(num.size()-1));
    }

    static class MyScanner{
        static String kLine(int maxLg) {
            byte lin[] = new byte[maxLg];
            int lg = 0, car = -1;
            String line = "";

            try {
                while (lg < maxLg) {
                    car = System.in.read();
                    if ((car < 0) || (car == '\n') || (car == '\r')) break;
                    lin[lg++] += car;
                }
            } catch (IOException e) {
                return (null);
            }

            if ((car < 0) && (lg == 0)) return (null);  // eof
            return (new String(lin, 0, lg));
        }

        static String knex(int maxLg) {
            byte lin[] = new byte[maxLg];
            int lg = 0, car = -1;
            String line = "";

            try {

                while ((car < 0) || (car == '\n') || (car == ' ') || (car == '\t') || (car == '\r'))
                    car = System.in.read();

                while (lg < maxLg) {
                    if ((car < 0) || (car == '\n') || (car == ' ') || (car == '\t') || (car == '\r')) break;
                    lin[lg++] += car;
                    car = System.in.read();
                }
            } catch (IOException e) {
                return (null);
            }

            if ((car < 0) && (lg == 0)) return (null);  // eof
            return (new String(lin, 0, lg));
        }

        static int kint() {
            return Integer.parseInt(knex(11));
        }

        static long kLong() {
            return Long.parseLong(knex(20));
        }

        static double kdouble() {
            return Double.parseDouble(knex(100));
        }
    }
}
