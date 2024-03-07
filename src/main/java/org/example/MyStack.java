package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> extends ArrayList<E> {
    private ArrayList<E> delegate;

    public MyStack(){
        delegate = this;
    }
    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (delegate.isEmpty()) throw new EmptyStackException();
        E e = delegate.get(size() - 1);
        delegate.remove(size() -1 );
        return e;
    }


}
