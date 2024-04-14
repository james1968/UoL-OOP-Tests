import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
public class VectorTest {
    Vector v = new Vector(1, 2);
    @Test
    public void getX() throws Exception {
        assertEquals(1, v.getX());
    }
    @Test
    public void getY() throws Exception {
        assertEquals(2, v.getY());
    }
    @Test
    public void add1() throws Exception {
        Vector y = new Vector(2, 4);
        assertEquals(4, y.add(2, 4).getX());
        Vector y1 = new Vector(2, 4);
        assertEquals(8, y1.add(2, 4).getY());
    }

    @Test
    public void add2() throws Exception {
        Vector s = new Vector(1,2);
        Vector t = new Vector(2, 4);
        assertEquals(3, s.add(t).getX());
        Vector s1 = new Vector(1,2);
        Vector t1 = new Vector(2, 4);
        assertEquals(6, s.add(t1).getY());
    }

    @Test
    public void sub1() throws Exception {
        Vector a = new Vector(2, 4);
        assertEquals(-1, a.sub(3, 6).getX());
        Vector a1 = new Vector(2, 4);
        assertEquals(-2, a1.sub(3, 6).getY());
    }

    @Test
    public void sub2() throws Exception {
        Vector d = new Vector(2, 4);
        Vector e = new Vector(3, 6);
        assertEquals(-1, d.sub(e).getX());
        Vector d1 = new Vector(2, 4);
        Vector e1 = new Vector(3, 6);
        assertEquals(-2, d1.sub(e1).getY());
    }

    @Test
    public void mult() throws Exception {
        Vector f = new Vector(1, 2);
        assertEquals(5, f.mult(5).getX());
        Vector f1 = new Vector(1, 2);
        assertEquals(10, f1.mult(5).getY());
    }

    @Test
    public void dot() throws Exception {
        Vector f = new Vector(3, 5);
        Vector g = new Vector(2,3);
        assertEquals(21, f.dot(g));
    }

    @Test
    public void toS() throws Exception {
        Vector j = new Vector(3, 4);
        assertEquals("(3,4)", j.toString());
    }

}