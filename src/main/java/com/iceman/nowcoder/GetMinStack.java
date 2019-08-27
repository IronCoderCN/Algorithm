package com.iceman.nowcoder;

import java.util.Stack;

public class GetMinStack {
    private Stack<Integer> minStack;
    private Stack<Integer> dataStack;

    public GetMinStack() {
        minStack = new Stack<>();
        dataStack = new Stack<>();
    }

    private int getmin() {
        return this.minStack.peek();
    }

    private void push(int num) {
        if (minStack.isEmpty()) {
            minStack.push(num);
        } else {
            minStack.push(num > minStack.peek() ? minStack.peek() : num);
        }
        dataStack.push(num);
    }

    private void pop() {
        if (!dataStack.isEmpty()){
            minStack.pop();
            dataStack.pop();
        }
    }

    public static void main(String[] args) {
        GetMinStack myStack = new GetMinStack();
        myStack.push(3);
        System.out.println(myStack.getmin());
        myStack.push(4);
        System.out.println(myStack.getmin());
        myStack.push(1);
        System.out.println(myStack.getmin());
        myStack.pop();
        System.out.println(myStack.getmin());
    }

}










