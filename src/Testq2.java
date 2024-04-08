public class Testq2 {

    public static void main(String[] args) {
        int a = 20, b = 3, c = 6;

        for (int d = 24; d > 0;) {
            b += c;
            if (a % 9 == 0) {
                d -= 3;
                break;
            }
            if (c > 6) {
                a++;
                continue;
            } else {
                a--;
            }

            for (int e = 1;; e++) {
                if (e % 2 == 0) {
                    c -= e;
                } else {
                    c += e;
                    b++;
                    continue;
                }
                if (b > 10) {
                    break;
                }
            }

            while (b < a) {
                d -= 2;
                b++;
            }
        }

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }
}
