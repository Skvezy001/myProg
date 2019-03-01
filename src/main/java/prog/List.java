package prog;

public class List<T> {

    private T next = null;
    private T previous;
    private int number;

    List(int number) {
        this.number = number;
    }

    public void setNext(T next) {
        this.next = next;
    }

    public T getNext() {
        return next;
    }

    public void setPrevious(T previous) {
        this.previous = previous;
    }

    public T getPrevious() {
        return previous;
    }

    public int getNumber() {
        return number;
    }

}
