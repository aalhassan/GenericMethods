package com.generics;

import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by student on 10/21/16.
 */
public class MainDemoTest {
    private final Logger logger = Logger.getLogger(this.getClass());
    @Test
    public void stringListContainsItemTest() throws Exception {
        String[] subject = {"goat", "camel", "ram", "pig", "dog"};
        assertTrue("List should contain goat", MainDemo.stringListContainsItem(subject, "goat"));
    }

    @Test
    public void stringListDoesNotContainItemTest() throws Exception {
        String[] subject = {"goat", "camel", "ram", "pig", "dog"};
        assertFalse("List should not contain deer", MainDemo.stringListContainsItem(subject, "deer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void stringListThrowsRightException() throws Exception {
        String[] subject = {"goat", "camel", "ram", "pig"};
        assertFalse("List should not contain deer", MainDemo.stringListContainsItem(subject, "deer"));
    }

  /* @Test
    public void stringListPassWrongItemTypeTest() throws Exception {
        String[] subject = {"goat", "camel", "ram", "pig", "dog"};
        assertTrue("List should contain goat", MainDemo.stringListContainsItem(subject, 2);
    }*/

    @Test
    public void objectListPassWrongItemTypeTest() throws Exception {
        String[] subject = {"goat", "camel", "ram", "pig", "dog"};
        assertFalse("List should not  contain 3", MainDemo.objectListContainsItem(subject, 3));

    }
    @Test
    public void genericListPassWrongItemTypeTest() throws Exception {
        String[] subject = {"goat", "camel", "ram", "pig", "dog"};
        assertFalse("List should not  contain 4", MainDemo.genericArrayContainsItem(subject, 4));
    }

    @Test
    public void genericListContainsStringItemTest() throws Exception {
        String[] subject = {"goat", "camel", "ram", "cat", "dog"};
        assertTrue("List should contain cat", MainDemo.genericArrayContainsItem(subject, "cat"));
    }


    @Test
    public void genericListContainsIntegerItemTest() throws Exception {
        Integer[] subject = {1, 2, 3, 4, 5};
        assertTrue("List should contain 2", MainDemo.genericArrayContainsItem(subject, 2));
    }

    @Test
    public void finalGenericContainsStringItemTypeTest() throws Exception {
        String[] subject = {"goat", "camel", "ram", "pig", "dog"};
        assertTrue("List should not  contain ram", MainDemo.finalGenericArrayContainsItem(subject, "ram"));
    }

    @Test
    public void finalGenericListContainsIntegerItemTest() throws Exception {
        Integer[] subject = {1, 2, 3, 4, 5};
        assertTrue("List should contain 2", MainDemo.finalGenericArrayContainsItem(subject, 2));
    }


   /* @Test
    public void finalGenericListPassWrongItemTypeTest() throws Exception {
        String[] subject = {"goat", "camel", "ram", "pig", "dog"};
        assertFalse("List should not  contain 2", MainDemo.finalGenericArrayContainsItem(subject, 2));
    }*/
}