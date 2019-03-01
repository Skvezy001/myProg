package prog;

import java.util.Arrays;
import java.util.Objects;

public class Stack {

    private List<List> last;
    private List<List> first;
    private int size;

    public List<List> getLast() {
        return last;
    }

    Stack(List<List> element) {
        this.first = element;
        this.first.setNext(null);
        this.first.setPrevious(null);
        this.last = null;
        this.size = 1;
    }

    public void push(List<List> element) {
        if (this.last != null) {
            this.last.setNext(element);
            element.setPrevious(this.last);
            this.last = element;
            this.size++;
        } else {
            this.first.setNext(element);
            element.setPrevious(this.first);
            this.last = element;
            this.size++;
        }
    }

    public void pop() {
        this.last = this.last.getPrevious();
        size--;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder strBul = new StringBuilder();
        List<List> element = this.first;
        for (int i = 0; i < size; i++) {
            strBul.append(element.getNumber());
            if (i != this.size - 1) {
                strBul.append(" ");
            }
            element = element.getNext();
        }
        return strBul.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stack stack = (Stack) o;
        return size == stack.size &&
                Objects.equals(last, stack.last) &&
                Objects.equals(first, stack.first);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first.getNumber(), size);
    }

}
