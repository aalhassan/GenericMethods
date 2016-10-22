package com.generics;


import org.apache.log4j.Logger;


/**Class to walkthrough generics scenario
 * Created by Mej on 10/21/16.
 */

public class MainDemo {
    private final Logger logger = Logger.getLogger(this.getClass());

    public static boolean stringListContainsItem(String[] list, String itemToCheck)
            throws IllegalArgumentException {
        if (list == null || list.length != 5)
            throw new IllegalArgumentException("Provided list must be non null and contain exactly 5 items");
        if (itemToCheck == null) {
            for ( String listItem : list )
                if (listItem == null)
                    return true;
        }
        else {
            for ( String listItem : list )
                if (itemToCheck.equals(listItem))
                    return true;
        }
        return false;
    }

    public static boolean integerListContainsItem(Integer[] list, Integer itemToCheck)
            throws IllegalArgumentException {
        if (list == null || list.length != 5)
            throw new IllegalArgumentException("Provided list must be non null and contain exactly 5 items");
        if (itemToCheck == null) {
            for ( Integer listItem : list )
                if (listItem == null)
                    return true;
        }
        else {
            for ( Integer listItem : list )
                if (itemToCheck.equals(listItem))
                    return true;
        }
        return false;
    }

    public static boolean objectListContainsItem(Object[] list, Object itemToCheck)
            throws IllegalArgumentException {
        if (list == null || list.length != 5)
            throw new IllegalArgumentException("Provided list must be non null and contain exactly 5 items");
        if (itemToCheck == null) {
            for ( Object listItem : list )
                if (listItem == null)
                    return true;
        }
        else {
            for ( Object listItem : list )
                if (itemToCheck.equals(listItem))
                    return true;
        }
        return false;
    }


    public static <T> boolean genericArrayContainsItem(T[] list, T itemToCheck)
            throws IllegalArgumentException {
        if (list == null || list.length != 5)
            throw new IllegalArgumentException("Provided list must be non null and contain exactly 5 items");
        if (itemToCheck == null) {
            for ( T listItem : list )
                if (listItem == null)
                    return true;
        }
        else {
            for ( T listItem : list )
                if (itemToCheck.equals(listItem))
                    return true;
        }
        return false;
    }

    /**
     * @param list Array to check for item
     * @param itemToCheck item to check
     * @param <T> The type items array holds
     * @param <I> The type of item array holds or a subclass of it
     * @return Whether itemToCheck was found in list or not
     * @throws IllegalArgumentException
     */
    public static <T, I extends T> boolean finalGenericArrayContainsItem(T[] list, I itemToCheck)
            throws IllegalArgumentException {
        if (list == null || list.length != 5)
            throw new IllegalArgumentException("Provided list must be non null and contain exactly 5 items");
        if (itemToCheck == null) {
            for ( T listItem : list )
                if (listItem == null)
                    return true;
        }
        else {
            for ( T listItem : list )
                if (itemToCheck.equals(listItem))
                    return true;
        }
        return false;
    }

}



