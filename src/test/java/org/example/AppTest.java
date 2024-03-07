package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.EmptyStackException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */


    public AppTest( String testName )
    {
        super( testName );
    }
    public void testPushAndPop(){
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());

        stack.push(5);
        assertFalse(stack.isEmpty());
        assertEquals(5,(int)stack.pop());
        assertTrue(stack.isEmpty());
    }

    public void testMultiplePushAndPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, (int)stack.pop());
        assertEquals(2, (int)stack.pop());
        assertEquals(1, (int)stack.pop());
        assertTrue(stack.isEmpty());
    }

    public void testPopOnEmptyStack() {
        MyStack<Double> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
        try {
            stack.pop(); // This should throw EmptyStackException
            fail("Expected EmptyStackException");
        } catch (EmptyStackException e) {
            // Pass
        }
    }

    public void testEmptyStack() {
        MyStack<Boolean> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    public void testSizeAfterPushAndPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
