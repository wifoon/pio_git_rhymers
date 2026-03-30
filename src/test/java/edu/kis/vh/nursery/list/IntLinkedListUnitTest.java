package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntLinkedListUnitTest {
    private IntLinkedList list;

    @Before
    public void setList()  {
        list = new IntLinkedList();
    }

    @Test
    public void testPushAndTop(){
        int testValue = 10;
        list.push(testValue);
        Assert.assertEquals(testValue, list.top());
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(list.isEmpty());
        list.push(1);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testPop() {
        int testValue = 5;
        list.push(testValue);
        Assert.assertEquals(testValue, list.pop());
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testTopOnEmpty() {
        Assert.assertEquals(-1, list.top());
    }
}
