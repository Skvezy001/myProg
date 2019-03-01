package prog;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ListTest {

    @Test
    public void setNextTest(){
        List<List> lt1 = new List<>(1);
        List<List> lt2 = new List<>(2);
        lt1.setNext(lt2);
        assertEquals(lt1.getNext(), lt2);
    }

    @Test
    public void getNextTest(){
        List<List> lt1 = new List<>(1);
        List<List> lt2 = new List<>(2);
        lt1.setNext(lt2);
        assertEquals(lt1.getNext(), lt2);
    }

    @Test
    public void setPreviousTest(){
        List<List> lt1 = new List<>(1);
        List<List> lt2 = new List<>(2);
        lt2.setPrevious(lt1);
        assertEquals(lt2.getPrevious(), lt1);
    }

    @Test
    public void getPreviousTest(){
        List<List> lt1 = new List<>(1);
        List<List> lt2 = new List<>(2);
        lt2.setPrevious(lt1);
        assertEquals(lt2.getPrevious(), lt1);
    }

    @Test
    public void getNumTest(){
        List<List> lt1 = new List<>(1);
        assertEquals(lt1.getNumber(), 1);
    }
}
