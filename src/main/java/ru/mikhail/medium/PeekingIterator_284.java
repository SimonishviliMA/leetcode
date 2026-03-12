package ru.mikhail.medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator_284 implements Iterator<Integer>  {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        PeekingIterator_284 peekingIterator = new PeekingIterator_284(list.iterator());
        while (peekingIterator.hasNext()) {
            System.out.println(peekingIterator.next());
            System.out.println(peekingIterator.peek());
        }
    }

    private final Iterator<Integer> iterator;
    private Integer next;

    public PeekingIterator_284(Iterator<Integer> iterator) {
        this.iterator = iterator;
        this.next = iterator.hasNext() ? iterator.next() : null;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int tmp = next;
        next = iterator.hasNext() ? iterator.next() : null;
        return tmp;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}
