package prog;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FractionTest {

    @Test
    public void addWithBothDataTest(){
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(2, 3);
        assertEquals(a.add(b).getNumerator(), 7);
        assertEquals(a.add(b).getDenominator(), 6);
    }

    @Test
    public void addWithOneDataTest(){
        Fraction a = new Fraction(1);
        Fraction b = new Fraction(2);
        assertEquals(a.add(b).getNumerator(), 3);
    }

    @Test
    public void toStringWithBothDataTest(){
        Fraction a = new Fraction(1, 2);
        assertEquals(a.toString(), "1/2");
    }

    @Test
    public void toStringWithOneDataTest(){
        Fraction a = new Fraction(1);
        assertEquals(a.toString(), "1");
    }

    @Test
    public void multWithBothDataTest(){
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(2, 3);
        assertEquals(a.mult(b).getNumerator(), 2);
        assertEquals(a.mult(b).getDenominator(), 6);
    }

    @Test
    public void multWithOneDataTest(){
        Fraction a = new Fraction(2);
        Fraction b = new Fraction(3);
        assertEquals(a.mult(b).getNumerator(), 6);

    }

    @Test
    public void equalsWithBothDataExpectTrueFirstTest(){
        Fraction a = new Fraction(1, 2);
        assertTrue(a.equals(a));
    }

    @Test
    public void equalsWithOneDataExpectTrueFirstTest(){
        Fraction a = new Fraction(1);
        assertTrue(a.equals(a));
    }

    @Test
    public void equalsExpectTrueSecondTest(){
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        assertTrue(a.equals(b));
    }

    @Test
    public void equalsExpectFalseTest(){
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(2, 3);
        assertFalse(a.equals(b));
    }

    @Test
    public void equalsWithOneDataExpectTrueSecondTest(){
        Fraction a = new Fraction(1);
        Fraction b = new Fraction(1);
        assertTrue(a.equals(b));
    }

    @Test
    public void equalsWithOneDataExpectFalseTest(){
        Fraction a = new Fraction(1);
        Fraction b = new Fraction(2);
        assertFalse(a.equals(b));
    }

    @Test
    public void equalsWithNullOneDataExpectFalseFirstTest(){
        Fraction a = new Fraction(1);
        assertFalse(a.equals(null));
    }

    @Test
    public void equalsWithNullBothDataExpectFalseFirstTest(){
        Fraction a = new Fraction(1, 2);
        assertFalse(a.equals(null));
    }

    @Test
    public void hashCodWithBothDataTest(){
        Fraction a = new Fraction(1, 2);
        assertEquals(a.hashCode(), 994);
    }

    @Test
    public void hashCodWithOneDataTest(){
        Fraction a = new Fraction(1);
        assertEquals(a.hashCode(), 32);
    }

    @Test
    public void compareToExpectZeroTest(){
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        assertEquals(a.compareTo(b), 0);
    }

    @Test
    public void compareToExpectPlusOneTest(){
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(11, 22);
        assertEquals(b.compareTo(a), 1);
    }

    @Test
    public void compareToExpectMinusOneTest(){
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(11, 22);
        assertEquals(a.compareTo(b), -1);
    }
}
