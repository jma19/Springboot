package com.im.server.api;

import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by majun on 16/6/22.
 */
public class LinkedListTest {

    @Test
    public void should_print_all_value() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Integer first = linkedList.getFirst();
        System.out.println(first);
        linkedList.remove(first);
        System.out.println(linkedList.getFirst());

    }
    /*
    Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
    For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.
     */

    @Test
    public void should_get_n_of_() throws Exception {

    }
}
