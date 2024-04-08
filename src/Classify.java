public class Classify {
    public static String classify( char c ) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        String upper = "";
        String vowel = "";
        if (Character.isAlphabetic(c) == false) {
            System.out.println("empty");
            return "";
        }
        char cL = Character.toLowerCase(c);
        for (char v : vowels) {
            if (v == cL) {
                vowel = "vowel";
                break;
            } else {
                vowel = "consonent";
            }
        }

        if (Character.isUpperCase(c)) {
            upper = "upper";
        } else {
            upper = "lower";
        }
        String ans = upper + " " + vowel;
        return ans;
    }

}
