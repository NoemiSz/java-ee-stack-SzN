package com.codecool.stack;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Slf4j
public class Stack {

    Object[] stack;
    private int size;
    private int counter;

    public Stack(int num) {
        stack = new Object[num];
        this.size = num;
    }

    public Object[] getStack() {
        return stack;
    }

    public void addToStack(Object newObj) {
            if (counter == size) {
                throw new ArrayIndexOutOfBoundsException("Stackoverflow");
            } else {
                stack[counter] = newObj;
                counter++;
            }
    }

    public void removeFromStack(){
//        TODO
    }

    public Object peekLastElement(){
        return stack[stack.length-1];
    }

    public int getSizeOfStack(){
//        TODO
        return 0;
    }
}
