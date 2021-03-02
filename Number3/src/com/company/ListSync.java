package com.company;

import java.util.*;

public class ListSync<E> implements List {
    private List<E> list = new ArrayList<E>();

    public ListSync() {
    }

    @Override
    public synchronized int size() {
        return list.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return list.contains((E) o);
    }

    @Override
    public synchronized Iterator iterator() {
        return list.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return list.toArray();
    }

    @Override
    public synchronized boolean add(Object o) {
        return list.add((E) o);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return list.remove((E) o);
    }

    @Override
    public synchronized boolean addAll(Collection collection) {
        return list.addAll(collection);
    }

    @Override
    public synchronized boolean addAll(int i, Collection collection) {
        return list.addAll(i, collection);
    }

    @Override
    public synchronized void clear() {
        list.clear();
    }

    @Override
    public synchronized Object get(int i) {
        return list.get(i);
    }

    @Override
    public synchronized Object set(int i, Object o) {
        return list.set(i, (E) o);
    }

    @Override
    public synchronized void add(int i, Object o) {
        list.add(i, (E) o);
    }

    @Override
    public synchronized Object remove(int i) {
        return list.remove(i);
    }

    @Override
    public synchronized int indexOf(Object o) {
        return list.indexOf((E) o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return list.lastIndexOf((E) o);
    }

    @Override
    public synchronized ListIterator listIterator() {
        return list.listIterator();
    }

    @Override
    public synchronized ListIterator listIterator(int i) {
        return list.listIterator(i);
    }

    @Override
    public synchronized List subList(int i, int i1) {
        return list.subList(i, i1);
    }

    @Override
    public synchronized boolean retainAll(Collection collection) {
        return list.retainAll(collection);
    }

    @Override
    public synchronized boolean removeAll(Collection collection) {
        return list.removeAll(collection);
    }

    @Override
    public synchronized boolean containsAll(Collection collection) {
        return list.containsAll(collection);
    }

    @Override
    public synchronized Object[] toArray(Object[] objects) {
        return list.toArray(objects);
    }

    @Override
    public synchronized String toString(){
        return "For ListSync {"+list+"}";
    }
}
