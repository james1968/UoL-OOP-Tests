public class Roman {
    public static String convert( int num ) {
        int thousands = 0;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;

        String ans = "";

        String arrayThousands[] = {"M", "MM", "MMM", "MMMM"};
        String arrayHundreds[] = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String arrayTens[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String arrayOnes[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        if (num > 999) {
            thousands = num / 1000;
            System.out.println(thousands);
            ans = arrayThousands[thousands -1];
            num = num % 1000;
        } if (num > 99) {
            hundreds = num / 100;
            System.out.println(hundreds);
            ans = ans + arrayHundreds[hundreds -1];
            num = num % 100;
        } if (num > 9) {
            tens = num / 10;
            System.out.println(tens);
            ans = ans + arrayTens[tens -1];
            num = num % 10;
            System.out.println(num);
        } if (num < 10 && num > 0) {
            System.out.println(num);
            ans = ans + arrayOnes[num -1];
            }

        return ans;
    }
}
