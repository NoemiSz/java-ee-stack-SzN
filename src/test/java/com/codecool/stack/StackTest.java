package com.codecool.stack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StackTest {

    Stack stack = new Stack(2);


    @Test
    public void addToStack(){
        stack.addToStack("name");
        assertEquals("name", stack.getStack()[0]);
    }

    @Test
    public void getException(){
        stack.addToStack("name");
        stack.addToStack("name");
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> stack.addToStack("newO"));
    }
    @Test
    public void peekLastElement(){
        stack.addToStack("name");
        stack.addToStack(12);
        assertEquals(12,stack.peekLastElement());
    }
    @Test
    public void getSizeOfStack(){
        stack.addToStack("name");
        assertEquals(1,stack.getSizeOfStack());
    }
    @Test
    public void removeFromStackTest(){
        stack.addToStack("name");
        stack.removeFromStack();
        assertEquals(null, stack.getStack()[0]);

    }
    @Test
    public void removedObjectTest(){
        stack.addToStack("name");
        assertEquals("name", stack.removeFromStack());

    }

}