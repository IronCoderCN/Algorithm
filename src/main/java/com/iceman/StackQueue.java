package com.iceman;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    public StackQueue() {
        this.pushStack = new Stack<Integer>();
        this.popStack = new Stack<Integer>();
    }

    private void push(int num){
        this.pushStack.push(num);
    }

    private int pop(int num){
        if (this.popStack.isEmpty() && this.pushStack.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        if (this.pushStack.isEmpty()){
            while (!this.pushStack.isEmpty()){
                this.popStack.push(this.pushStack.pop());
            }
        }
        return this.popStack.pop();
    }

    private int peek(int num){
        if (this.popStack.isEmpty() && this.pushStack.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        if (this.pushStack.isEmpty()){
            while (!this.pushStack.isEmpty()){
                this.popStack.push(this.pushStack.pop());
            }
        }
        return this.popStack.peek();
    }

}
