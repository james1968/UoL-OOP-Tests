public class Separate {
    public static String separate(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            t += s.charAt(i);
            if (i != s.length() - 1) {
                t += ',';
            }
        }
        return t;
    }
}