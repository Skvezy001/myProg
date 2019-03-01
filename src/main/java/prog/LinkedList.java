package prog;

import java.util.Objects;

public class LinkedList {

    private List<List> last;
    private List<List> first;
    private int size;

    LinkedList(List<List> first) {
        this.first = first;
        this.last = null;
        this.size = 1;
    }

    public List<List> getLast() {
        return this.last;
    }

    public List<List> getFirst() {
        return this.first;
    }

    public List add(int num, List<List> previous) {
        List<List> element = new List<>(num);
        if (this.last != null) {
            previous.setNext(element);
            element.setPrevious(previous);
            this.size++;
            this.last = element;
            return element;
        }
        this.first.setNext(element);
        element.setPrevious(this.first);
        this.last = element;
        this.size++;
        return element;

    }

    public boolean remove(int index) {
        if (index > 0) {
            List<List> list = this.first;
            if (index < this.size) {
                list = findElement(index);
                List<List> list1 = list;

                list.getNext().setPrevious(list1.getPrevious());
                list.getPrevious().setNext(list1.getNext());
                size--;
                return true;
            } else if(index == this.size) {
                this.last = this.last.getPrevious();
                this.last.setNext(null);
                size--;
                return true;
            }
        }
        return false;
    }

    public String get(int index) {
        if (index < this.size) {
            return findElement(index).getNumber() + "";
        } else if (index == this.size) {
            return this.last.getNumber() + "";
        }
        return "Error";
    }

    public int size() {
        return this.size;
    }

    private List findElement(int index) {
        int trueIndex = index - 1;
        List<List> element = first;
        int i = 0;
        do {
            element = element.getNext();
            i++;
        } while (i != trueIndex);
        return element;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public String toString() {
        int i = 0;
        String str = "";
        List<List> list = this.first;
        do {
            str += list.getNumber() + " ";
            list = list.getNext();
            i++;
        } while (i < size);
        return str;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first.getNumber(), size);
    }
}
