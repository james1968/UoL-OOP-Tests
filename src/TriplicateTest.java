package Test.src;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TriplicateTest {


    @Test

    public void triplicate() throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(1);
        ans.add(1);
        ans.add(1);
        ans.add(2);
        ans.add(2);
        ans.add(2);
        ans.add(3);
        ans.add(3);
        ans.add(3);
        ans.add(4);
        ans.add(4);
        ans.add(4);
        ans.add(5);
        ans.add(5);
        ans.add(5);
        ans.add(1);
        ans.add(1);
        ans.add(1);

        assertEquals(ans, Triplicate.triplicate(list));

    }
}