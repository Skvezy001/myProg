package prog;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void addTest(){
        List<List> list = new List<>(1);
        LinkedList listTest = new LinkedList(list);
        List<List> list1 = listTest.add(2, list);
        assertEquals(list1.getPrevious().getNumber(), 1);
    }

    @Test
    public void sizeTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        List<List> list1 = listTest.add(2, list);
        List<List> list2 = listTest.add(3, list1);
        List<List> list3 = listTest.add(4, list2);
        List<List> list4 = listTest.add(5, list3);

        assertEquals(listTest.size(), 5);
    }

    @Test
    public void getLastTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        List<List> list1 = listTest.add(2, list);
        List<List> list2 = listTest.add(3, list1);

        assertEquals(listTest.getLast().getNumber(), 3);
    }

    @Test
    public void getFirstTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        List<List> list1 = listTest.add(2, list);

        assertEquals(listTest.getFirst().getNumber(), 1);
    }

    @Test
    public void removeExpectTrueTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        List<List> list1 = listTest.add(2, list);
        List<List> list2 = listTest.add(3, list1);
        List<List> list3 = listTest.add(4, list2);
        List<List> list4 = listTest.add(5, list3);

        assertEquals(listTest.remove(2), true);
    }

    @Test
    public void removeExpectFalseTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        List<List> list1 = listTest.add(2, list);
        List<List> list2 = listTest.add(3, list1);
        List<List> list3 = listTest.add(4, list2);
        List<List> list4 = listTest.add(5, list3);

        assertEquals(listTest.remove(7), false);
    }

    @Test
    public void removeLastExpectTrueTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        List<List> list1 = listTest.add(2, list);
        List<List> list2 = listTest.add(3, list1);
        List<List> list3 = listTest.add(4, list2);
        List<List> list4 = listTest.add(5, list3);

        assertEquals(listTest.remove(5), true);
    }

    @Test
    public void getTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        List<List> list1 = listTest.add(2, list);
        List<List> list2 = listTest.add(3, list1);
        List<List> list3 = listTest.add(4, list2);
        List<List> list4 = listTest.add(5, list3);

        assertEquals(listTest.get(3), "3");
    }

    @Test
    public void getExpectLastTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        List<List> list1 = listTest.add(2, list);
        List<List> list2 = listTest.add(3, list1);
        List<List> list3 = listTest.add(4, list2);
        List<List> list4 = listTest.add(5, list3);

        assertEquals(listTest.get(5), "5");
    }

    @Test
    public void getExpectErrorTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        List<List> list1 = listTest.add(2, list);
        List<List> list2 = listTest.add(3, list1);
        List<List> list3 = listTest.add(4, list2);
        List<List> list4 = listTest.add(5, list3);

        assertEquals(listTest.get(8), "Error");
    }

    @Test
    public void equalsExpectTrueTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        assertEquals(listTest.equals(listTest), true);
    }

    @Test
    public void equalsExpectFalseTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        List<List> list1 = listTest.add(2, list);

        LinkedList listTest1 = new LinkedList(list1);

        assertEquals(listTest.equals(listTest1), false);
    }

    @Test
    public void toStringTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        List<List> list1 = listTest.add(2, list);
        List<List> list2 = listTest.add(3, list1);
        List<List> list3 = listTest.add(4, list2);
        List<List> list4 = listTest.add(5, list3);

        assertEquals(listTest.toString(), "1 2 3 4 5 ");
    }

    @Test
    public void hashCodeTest(){
        List<List> list = new List<>(1);

        LinkedList listTest = new LinkedList(list);

        assertEquals(listTest.hashCode(), 16625355);

    }
}
