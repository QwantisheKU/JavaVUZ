package com.company;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class SetSemaphore<E> implements Set{
    private static final Semaphore sem = new Semaphore(1);
    private ArrayList<E> array = new ArrayList<>();
    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        boolean smth = false;
        try {
            sem.acquire();
            smth = array.contains(o);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return smth;
    }

    @Override
    public Iterator iterator() {
        return array.iterator();
    }

    @Override
    public Object[] toArray() {
        return array.toArray();
    }

    @Override
    public boolean add(Object o) {
        boolean smth = false;
        try {
            sem.acquire();
            smth = array.add((E) o);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return smth;
    }

    @Override
    public boolean remove(Object o) {
        boolean smth = false;
        try {
            sem.acquire();
            smth = array.remove((E) o);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return smth;
    }

    @Override
    public boolean addAll(Collection collection) {
        boolean smth = false;
        try {
            sem.acquire();
            smth = array.addAll(collection);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return smth;
    }

    @Override
    public void clear() {
        boolean smth = false;
        try {
            sem.acquire();
            array.clear();
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        boolean smth = false;
        try {
            sem.acquire();
            smth = array.removeAll(collection);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return smth;
    }

    @Override
    public boolean retainAll(Collection collection) {
        boolean smth = false;
        try {
            sem.acquire();
            smth = array.retainAll(collection);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return smth;
    }

    @Override
    public boolean containsAll(Collection collection) {
        boolean smth = false;
        try {
            sem.acquire();
            smth = array.containsAll(collection);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return smth;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return array.toArray(objects);
    }

    @Override
    public String toString(){
        return "For SetSemaphore {"+array+"}";
    }
}
