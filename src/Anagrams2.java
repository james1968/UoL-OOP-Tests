import java.io.*;
import java.util.*;

public class Anagrams2 {

    public static char anagrams(String a, String b) {
        HashMap<Character, Integer> A = alphaFrequency(a);
        HashMap<Character, Integer> B = alphaFrequency(b);

        ArrayList<Character> diff = new ArrayList<Character>();
        for (char ch : A.keySet()) {
            if (!B.containsKey(ch) || B.get(ch) != A.get(ch)) {
                diff.add(ch);
            }
        }
        for (char ch : B.keySet()) {
            if (!A.containsKey(ch) || A.get(ch) != B.get(ch)) {
                diff.add(ch);
            }
        }

        if (!diff.isEmpty()) {
            char max = diff.get(0);
            for (char ch : diff) {
                if (ch > max) {
                    max = ch;
                }
            }
            return max;
        }

        return '!';
    }

    // Returns a HashMap whose entries are the alphabet characters in s (converted
// to lowercase) and the number of times they occur in s.
    public static HashMap<Character, Integer> alphaFrequency(String s) {
        HashMap<Character, Integer> frequencies = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!isAlpha(ch)) {
                continue;
            } else {
                ch = Character.toLowerCase(ch);
            }
            if (frequencies.containsKey(ch)) {
                frequencies.put(ch, frequencies.get(ch) + 1);
            } else {
                frequencies.put(ch, 1);
            }
        }
        return frequencies;
    }

    public static boolean isAlpha(char ch) {
        return ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z');
    }
}
