package com.iceman.nowcoder;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
    private Queue<Integer> dataQueue;
    private Queue<Integer> helpQueue;

    public QueueStack() {
        this.dataQueue = new LinkedList<Integer>();
        this.helpQueue = new LinkedList<Integer>();
    }

    private int pop(){
        if (this.dataQueue.isEmpty()){
            return -1;
        }
        while(this.dataQueue.size() > 1){
            this.helpQueue.add(this.dataQueue.poll());
        }
        Queue<Integer> tmp = this.helpQueue;
        this.helpQueue = this.dataQueue;
        this.dataQueue= tmp;
        return this.helpQueue.poll();
    }

    private void push(int num){
        this.dataQueue.add(num);
    }

    private int peek(){
        if (this.dataQueue.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        while (this.dataQueue.size() != 1) {
            this.helpQueue.add(this.dataQueue.poll());
        }
        int res = this.dataQueue.poll();
        this.helpQueue.add(res);
        Queue<Integer> tmp = this.helpQueue;
        this.helpQueue = this.dataQueue;
        this.dataQueue= tmp;
        return res;
    }

}
