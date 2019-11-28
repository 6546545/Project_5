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
import student.TestCase;

/**
 * @author Andy Gould, Dwarakh Nayam, Kevin Kapros
 * @version 2019.12.3
 */

public class DLLinkedListNodesTest extends TestCase {
    /**
     * the list we will use
     */
    private DLLinkedListNodes<String> list;


    /**
     * run before every test case
     */
    @Override
    public void setUp() {
        list = new DLLinkedListNodes<String>();
    }


    /**
     * Tests that an IndexOutOfBounds exception is thrown when the index is
     * greater than or equal to size and less than zero
     */
    public void testRemoveException() {
        list.add("A");
        Exception e = null;
        try {
            list.remove(2);
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);
        e = null;
        try {
            list.remove(-1);
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);
    }


    /**
     * Tests that objects can be removed at the beginning and end and that the
     * size is changed
     */
    public void testRemoveIndex() {
        list.add("A");
        list.add("B");
        assertTrue(list.remove(1));
        assertEquals(1, list.size());
        list.add("B");
        assertTrue(list.remove(0));
        assertEquals(1, list.size());
    }


    /**
     * Tests the add method. Ensures that it adds the object is added at the end
     * and the size is increased
     */
    public void testAdd() {
        assertEquals(0, list.size());
        list.add("A");
        assertEquals(1, list.size());
        list.add("B");
        assertEquals(2, list.size());
        assertEquals("B", list.get(1));

    }


    /**
     * Tests that objects can be added at the beginning and end and that they
     * are placed correctly
     */
    public void testAddIndex() {
        list.add("B");
        list.add(0, "A");
        assertEquals("A", list.get(0));
        assertEquals(2, list.size());
        list.add(2, "D");
        assertEquals("D", list.get(2));
        list.add(2, "C");
        assertEquals("C", list.get(2));
    }


    /**
     * This tests that the add method throws a null pointer exception when
     * adding null data to the list
     */
    public void testAddNullException() {
        Exception e = null;
        try {
            list.add(null);
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IllegalArgumentException);
    }


    /**
     * This tests that the add method throws a Invalid argument when adding null
     * data to the list
     */
    public void testAddIndexNullException() {
        Exception e = null;
        try {
            list.add(0, null);
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IllegalArgumentException);
    }


    /**
     * This tests when the add method is called and the index is greater than
     * size or less than zero
     */
    public void testAddException() {
        list.add("A");
        Exception e = null;
        try {
            list.add(2, "B");
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);
        e = null;
        try {
            list.add(-1, "B");
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);
    }


    /**
     * Tests removing a object changes the size appropiately and that you can
     * remove the first and last elements
     */
    public void testRemoveObj() {
        assertFalse(list.remove(null));
        list.add("A");
        list.add("B");
        assertTrue(list.remove("A"));
        assertEquals("B", list.get(0));
        assertEquals(1, list.size());
        list.add("C");
        assertTrue(list.remove("C"));
        assertEquals("B", list.get(0));
    }


    /**
     * Tests get when the index is greater than or equal to size and when the
     * index is less than zero
     */
    public void testGetException() {
        Exception exception = null;
        try {
            list.get(-1);
        }
        catch (Exception e) {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);
        exception = null;
        list.add("A");
        try {
            list.get(1);
        }
        catch (IndexOutOfBoundsException e) {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);
    }


    /**
     * Test contains when it does and does not contain the object
     */
    public void testContains() {
        assertFalse(list.contains("A"));
        list.add("A");
        assertTrue(list.contains("A"));
        assertFalse(list.contains("B"));
        list.add("B");
        assertTrue(list.contains("B"));
    }


    /**
     * Test lastIndexOf when the list is empty, when the object is not in the
     * list, and when it is at the beginning or end
     */
    public void testLastIndexOf() {
        assertEquals(-1, list.lastIndexOf("A"));
        list.add("A");
        assertEquals(0, list.lastIndexOf("A"));
        list.add("A");
        assertEquals(1, list.lastIndexOf("A"));
        list.add("B");
        assertEquals(1, list.lastIndexOf("A"));
        assertEquals(2, list.lastIndexOf("B"));
        list.add("A");
        assertEquals(3, list.lastIndexOf("A"));
    }


    /**
     * Tests isEmpty when empty and full
     */
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.add("A");
        assertFalse(list.isEmpty());
    }


    /**
     * Ensures that all of the objects are cleared and the size is changed
     */
    public void testClear() {
        list.add("A");
        list.clear();
        assertEquals(0, list.size());
        assertFalse(list.contains("A"));
    }


    /**
     * Tests the toString when there are 0, 1, and 2 objects in the list
     */
    public void testToString() {
        assertEquals("{}", list.toString());
        list.add("A");
        assertEquals("{A}", list.toString());
        list.add("B");
        assertEquals("{A, B}", list.toString());
    }


    /**
     * Tests removing from an empty list
     */
    public void testRemoveFromEmpty() {
        list.add("dance");
        list.add(0, "safety");
        list.clear();
        assertFalse(list.remove("safety"));
        Exception exception;
        exception = null;
        try {
            list.remove(0);
        }
        catch (IndexOutOfBoundsException e) {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);

        DLLinkedListNodes<String> emptyList = new DLLinkedListNodes<String>();
        exception = null;
        try {
            emptyList.remove(0);
        }
        catch (IndexOutOfBoundsException e) {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);
    }


    /**
     * TestHasNext
     */
    public void testHasNext() {
        DLLinkedListNodes<String> temp = new DLLinkedListNodes<String>();
        Iterator<String> iter = temp.iterator();
        assertEquals(iter.hasNext(), false);
        temp.add("A");
        assertEquals(iter.hasNext(), true);
    }


    /**
     * TestNext
     */
    public void testNext() {
        DLLinkedListNodes<String> temp = new DLLinkedListNodes<String>();
        Iterator<String> iter = temp.iterator();
        boolean thrown = false;
        try {
            iter.next();
        }
        catch (NoSuchElementException e) {
            thrown = true;
        }
        assertEquals(thrown, true);
        temp.add("A");
        assertEquals(iter.next(), "A");
        temp.add("B");
        assertEquals(iter.next(), "B");
        temp.add("C");
        assertEquals(iter.next(), "C");
    }


    /**
     * TestRemove
     */
    public void testRemove() {
        Iterator<String> iter = list.iterator();
        boolean thrown = false;
        try {
            iter.remove();
        }
        catch (IllegalStateException e) {
            thrown = true;
        }
        assertEquals(thrown, true);
        thrown = false;

        try {
            iter.next();
        }
        catch (NoSuchElementException e) {
            thrown = true;
        }

        try {
            iter.remove();
        }
        catch (IllegalStateException e) {
            thrown = true;
        }
        assertEquals(thrown, true);
        thrown = false;

        try {
            iter.remove();
        }
        catch (IllegalStateException e) {
            thrown = true;
        }
        assertEquals(thrown, true);
        thrown = false;

        list.add("");
        list.add("B");
        assertEquals(list.size(), 2);
        iter.next();
        iter.remove();
        assertEquals(list.size(), 1);

    }


    /**
     * test
     */
    public void testHasNextP() {
        DLLinkedListNodes<String> temp = new DLLinkedListNodes<String>();
        Iterator<String> iter = temp.reverseIterator();
        assertEquals(iter.hasNext(), false);
        temp.add("A");
        assertEquals(iter.hasNext(), true);

    }


    /**
     * test
     */
    public void testNextP() {
        DLLinkedListNodes<String> temp = new DLLinkedListNodes<String>();
        Iterator<String> iter = temp.reverseIterator();
        boolean thrown = false;
        try {
            iter.next();
        }
        catch (NoSuchElementException e) {
            thrown = true;
        }
        assertEquals(thrown, true);
        temp.add("A");
        temp.add("B");
        temp.add("C");
        assertEquals(iter.next(), "C");
        assertEquals(iter.next(), "B");
        assertEquals(iter.next(), "A");
    }


    /**
     * testRemoveP
     */
    public void testRemoveP() {
        Iterator<String> iter = list.reverseIterator();
        boolean thrown = false;
        try {
            iter.remove();
        }
        catch (IllegalStateException e) {
            thrown = true;
        }
        assertEquals(thrown, true);
        thrown = false;
        try {
            iter.next();
        }
        catch (NoSuchElementException e) {
            thrown = true;
        }
        assertEquals(thrown, true);
        thrown = false;
        try {
            iter.remove();
        }
        catch (IllegalStateException e) {
            thrown = true;
        }
        assertEquals(thrown, true);
        thrown = false;

        list.add("A");
        list.add("B");

        try {
            iter.remove();
        }
        catch (IllegalStateException e) {
            thrown = true;
        }
        assertEquals(thrown, true);
        thrown = false;

        assertEquals(list.size(), 2);
        iter.next();
        iter.remove();
        assertEquals(list.size(), 1);
    }
}
