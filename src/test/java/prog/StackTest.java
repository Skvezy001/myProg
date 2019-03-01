package prog;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StackTest {

    @Test
    public void pushTest() {
        List<List> list1 = new List<>(1);
        List<List> list2 = new List<>(2);
        List<List> list3 = new List<>(3);
        Stack st = new Stack(list1);
        st.push(list2); st.push(list3);
        assertEquals(st.getLast().getNumber(), 3);
    }

    @Test
    public void popTest() {
        List<List> list1 = new List<>(1);
        List<List> list2 = new List<>(2);
        List<List> list3 = new List<>(3);
        Stack st = new Stack(list1);
        st.push(list2); st.push(list3); st.pop();
        assertEquals(st.getLast().getNumber(), 2);
    }

    @Test
    public void sizeTest() {
        List<List> list1 = new List<>(1);
        List<List> list2 = new List<>(2);
        List<List> list3 = new List<>(3);
        Stack st = new Stack(list1);
        st.push(list2); st.push(list3);
        assertEquals(st.size(), 3);
    }

    @Test
    public void toStringTest() {
        List<List> list1 = new List<>(1);
        List<List> list2 = new List<>(2);
        List<List> list3 = new List<>(3);
        Stack st = new Stack(list1);
        st.push(list2); st.push(list3);
        assertEquals(st.toString(), "1 2 3");
    }

    @Test
    public void equalsWithDifferentObjectsExpectFalseTest() {
        List<List> list1 = new List<>(1);
        List<List> list2 = new List<>(2);
        Stack st1 = new Stack(list1);
        Stack st2 = new Stack(list2);
        assertEquals(st1.equals(st2), false);
    }

    @Test
    public void equalsExpectTrueTest() {
        List<List> list1 = new List<>(1);
        Stack st1 = new Stack(list1);
        Stack st2 = new Stack(list1);
        assertEquals(st1.equals(st2), true);
    }

    @Test
    public void equalsWithNullValueExpectFalseTest() {
        List<List> list1 = new List<>(1);
        Stack st1 = new Stack(list1);
        assertEquals(st1.equals(null), false);
    }

    @Test
    public void hashCodeTest() {
        List<List> list1 = new List<>(1);
        Stack st1 = new Stack(list1);
        assertEquals(st1.hashCode(), 993);
    }

}
