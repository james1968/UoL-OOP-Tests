import java.io.*;
import java.util.*;
public class Anagrams {
    public static char anagrams( String a, String b )
    {
        a = a.toLowerCase().trim();
        System.out.println(a);
        b = b.toLowerCase().trim();
        System.out.println(b);
        char tempArray1[] = a.toCharArray();
        Arrays.sort(tempArray1);
        System.out.println(tempArray1);
        char tempArray2[] = b.toCharArray();
        Arrays.sort(tempArray2);
        System.out.println(tempArray2);
        char diffs[] = new char[10];
        if (Arrays.toString(tempArray1).equals(Arrays.toString(tempArray2))) {
            return '!';
        } else {

            for (int i = 0; i < tempArray2.length; i++) {
                for (int j = 0; j < tempArray1.length; j++) {
                    if (tempArray2[i] != tempArray1[j]) {
                        diffs[i] = tempArray2[i];
                    }
                }
            }
        }

        //char ans = diffs[-1];
        System.out.println(diffs);
        return 'a';
    }

}
