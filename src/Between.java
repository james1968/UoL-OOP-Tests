package Test.src;

public class Between {
    public static String between( int a, int b )
    {
        String ans = "";
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                if (i % 2 != 0) {
                    ans += i;
                    ans += " ";
                }
            }
        } else if(a > b) {
            for (int i = a - 1; i > b; i--) {
                if (i % 2 != 0) {
                    ans += i;
                    ans += " ";
                }
            }
        }
        ans = ans.trim();
        return ans;

    }
}
