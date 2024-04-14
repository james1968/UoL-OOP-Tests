import java.util.ArrayList;

public class Triplicate {
    public static ArrayList<Integer> triplicate(ArrayList<Integer> list )
    {
        int maxLength = list.size() * 3;
        System.out.println(list.size());
        for (int i = 0; i < maxLength; i+=3) {
            int item = list.get(i);
            list.add(i+1, item);
            list.add(i+2, item);
        }
        System.out.println(list);
        return list;
    }

}
