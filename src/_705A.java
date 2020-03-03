import java.io.IOException;

public class _705A {
    public static void main(String[] args) {
        MyScanner input = new MyScanner();
        int n = input.kint();

        for (int i=0; i<n; i++){
            if (i%2 == 0)
                System.out.print("I hate ");
            else
                System.out.print("I love ");
            if (i == n-1)
                System.out.print("it");
            else
                System.out.print("that ");
        }
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
