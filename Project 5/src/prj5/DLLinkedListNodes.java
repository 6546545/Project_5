// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Andy Gould gandy, Dwarakh Nayam dwarakh, Kevin Kapros kevinkapros
//

package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Andy Gould, Dwarakh Nayam, Kevin Kapros
 * @version 2019.12.3
 * @param <T>
 *            Generic Type
 */
public class DLLinkedListNodes<T> {

    /**
     * Private Inner Node Class
     */
    private static class Node<E> {
        /**
         * Private Variables
         */
        private Node<E> next;
        private Node<E> previous;
        private E data;


        /**
         * Creates a new node
         *
         * @param d
         *            the data for insertion
         */
        public Node(E d) {
            data = d;
        }


        /**
         * Sets the next node
         *
         * @param n
         *            the node after this one
         */
        public void setNext(Node<E> n) {
            next = n;
        }


        /**
         * Sets the previous node
         *
         * @param n
         *            the node before this one
         */
        public void setPrevious(Node<E> n) {
            previous = n;
        }


        /**
         * Gets the next node
         *
         * @return the next node
         */
        public Node<E> next() {
            return next;
        }


        /**
         * Gets the previous node
         *
         * @return the previous node
         */
        public Node<E> previous() {
            return previous;
        }


        /**
         * Gets the data
         *
         * @return the data
         */
        public E getData() {
            return data;
        }
    }

    /**
     * Size of the list
     */
    private int size;

    /**
     * Head Node---Sentinal node
     */
    private Node<T> head;

    /**
     * Tail Node---Sentinal node
     */
    private Node<T> tail;


    /**
     * Create a new DLList object.
     */
    public DLLinkedListNodes() {
        init();
    }


    /**
     * Initialize the head and tail nodes
     */
    private void init() {
        head = new DLLinkedListNodes.Node<T>(null);
        tail = new DLLinkedListNodes.Node<T>(null);
        head.setNext(tail);
        tail.setPrevious(head);
        size = 0;
    }


    /**
     * Checks if the array is empty
     *
     * @return true if the array is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * Gets the size of the list
     *
     * @return the number of elements
     */
    public int size() {
        return size;
    }


    /**
     * Removes all of the elements
     */
    public void clear() {
        init();
    }


    /**
     * Checks if the list contains the given object
     *
     * @param obj
     *            the object to check for
     * @return true if it contains the object
     */
    public boolean contains(T obj) {
        return lastIndexOf(obj) != -1;
    }


    /**
     * Gets the object at the given position
     *
     * @param index
     *            where the object is located
     * @return The object at the given position
     * @throws IndexOutOfBoundsException
     *             if there no node
     */
    public T get(int index) {
        return getNodeAtIndex(index).getData();
    }


    /**
     * Adds a element to the end of the list
     *
     * @param newEntry
     *            the element to add to the end
     */
    public void add(T newEntry) {
        add(size(), newEntry);
    }


    /**
     * Adds the object to the position in the list
     *
     * @param index
     *            where to add the object
     * @param obj
     *            the object to add
     * @throws IndexOutOfBoundsException
     *             if index is less than zero or greater than size
     * @throws IllegalArgumentException
     *             if obj is null
     */
    public void add(int index, T obj) {
        if (index < 0 || size < index) {
            throw new IndexOutOfBoundsException();
        }
        if (obj == null) {
            throw new IllegalArgumentException("Cannot add null "
                + "objects to a list");
        }

        Node<T> nodeAfter;
        if (index == size) {
            nodeAfter = tail;
        }
        else {
            nodeAfter = getNodeAtIndex(index);
        }

        Node<T> addition = new Node<T>(obj);
        addition.setPrevious(nodeAfter.previous());
        addition.setNext(nodeAfter);
        nodeAfter.previous().setNext(addition);
        nodeAfter.setPrevious(addition);
        size++;

    }


    /**
     * gets the node at that index
     * 
     * @param index
     * @return node at index
     */
    private Node<T> getNodeAtIndex(int index) {
        if (index < 0 || size() <= index) {
            throw new IndexOutOfBoundsException("No element exists at "
                + index);
        }
        Node<T> current = head.next(); // as we have a sentinel node
        for (int i = 0; i < index; i++) {
            current = current.next();
        }
        return current;
    }


    /**
     * Gets the last time the given object is in the list
     *
     * @param obj
     *            the object to look for
     * @return the last position of it. -1 If it is not in the list
     */
    public int lastIndexOf(T obj) {

        Node<T> current = tail.previous();
        for (int i = size() - 1; i >= 0; i--) {
            if (current.getData().equals(obj)) {
                return i;
            }
            current = current.previous();
        }
        return -1;
    }


    /**
     * Removes the element at index i
     *
     * @param index
     *            where the object is located
     * @throws IndexOutOfBoundsException
     *             if there is not an element at the index
     * @return true if successful
     */
    public boolean remove(int index) {
        Node<T> nodeToBeRemoved = getNodeAtIndex(index);
        nodeToBeRemoved.previous().setNext(nodeToBeRemoved.next());
        nodeToBeRemoved.next().setPrevious(nodeToBeRemoved.previous());
        size--;
        return true;
    }


    /**
     * Removes the first object in the list equals the given obj
     *
     * @param obj
     *            the object to remove
     * @return true if the object was found and removed
     */

    public boolean remove(T obj) {
        Node<T> current = head.next();
        while (!current.equals(tail)) {
            if (current.getData().equals(obj)) {
                current.previous().setNext(current.next());
                current.next().setPrevious(current.previous());
                size--;
                return true;
            }
            current = current.next();
        }
        return false;
    }


    /**
     * Returns a custom string
     *
     * @return a string representing the list
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        if (!isEmpty()) {
            Node<T> currNode = head.next();
            while (currNode != tail) {
                T element = currNode.getData();
                builder.append(element.toString());
                if (currNode.next != tail) {
                    builder.append(", ");
                }
                currNode = currNode.next();
            }
        }

        builder.append("}");
        return builder.toString();
    }


    /**
     * Creates Iterator object
     *
     * @return new Iterator object
     */
    public Iterator<T> iterator() {
        return new DLListIterator<T>();
    }


    /**
     * Creates Iterator object
     *
     * @return new Iterator object
     */
    public Iterator<T> reverseIterator() {
        return new RDLListIterator<T>();
    }


    /**
     * 
     * @author Andy Gould, Dwarakh Nayam, and Kevin Kapros
     * @param T
     *            Generic Type
     * 
     */
    private class DLListIterator<T> implements Iterator<T> {

        private Node<T> current;
        private boolean nextCalled = false;


        /**
         * Creates a new DLListIterator
         */
        @SuppressWarnings("unchecked")
        public DLListIterator() {
            current = (Node<T>)head;
            nextCalled = false;
        }


        /**
         * hasNext
         */
        @Override
        public boolean hasNext() {
            return (current.next().getData() != null);
        }


        /**
         * Next
         */
        @Override
        public T next() {
            if (hasNext()) {
                nextCalled = true;
                current = current.next();
                return current.getData();
            }
            else {
                throw new NoSuchElementException("No element after this");
            }
        }


        /**
         * remove
         */
        @Override
        public void remove() {

            if (!nextCalled) {
                throw new IllegalStateException("Can't remove");
            }
            else {

                current.next.setPrevious(current.previous);
                current.previous.setPrevious(current.next);
                nextCalled = false;
                size--;
            }

        }

    }


    /**
     * 
     * @author Andy Gould, Dwarakh Nayam, and Kevin Kapros
     * 
     * @param <A>
     *            Generic Type
     */
    private class RDLListIterator<A> implements Iterator<T> {

        /**
         * Private Variables
         */
        private Node<T> current;
        private boolean nextCalled = false;


        /**
         * RDListIterator
         */
        public RDLListIterator() {
            current = tail;
            nextCalled = false;
        }


        /**
         * hasNext
         */
        @Override
        public boolean hasNext() {
            return (current.previous.getData() != null);
        }


        /**
         * Next
         */
        @Override
        public T next() {
            if (hasNext()) {
                nextCalled = true;
                current = current.previous;
                return current.getData();
            }
            else {
                throw new NoSuchElementException("No element after this");
            }
        }


        /**
         * remove
         */
        @Override
        public void remove() {

            if (!nextCalled) {
                throw new IllegalStateException("Can't remove");
            }
            else {
                current.previous.setNext(current.next);
                current.next.setPrevious(current.previous);

                size--;
                nextCalled = false;
            }
        }

    }

}
