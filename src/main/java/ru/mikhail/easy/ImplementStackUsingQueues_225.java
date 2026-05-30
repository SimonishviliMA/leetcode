package ru.mikhail.easy;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class ImplementStackUsingQueues_225 {

    public static void main(String[] args) {
        System.out.println("Two queue: {");
        testStack(new MyStackWithTwoQueue());
        System.out.println("}\nOne queue: {");
        testStack(new MyStackWithOneQueue());
        System.out.println("}");
    }

    private static void testStack(MyStack stack) {
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        System.out.println("top: " + stack.top());
        System.out.println("pop: " + stack.pop());
        System.out.println("empty? " + stack.empty());
        System.out.println(stack);

    }

    interface MyStack {
        void push(int x);
        int pop();
        int top();
        boolean empty();
    }

    static class MyStackWithTwoQueue implements MyStack {

        private final Queue<Integer> queue1 = new ArrayDeque<>();
        private final Queue<Integer> queue2 = new ArrayDeque<>();

        public MyStackWithTwoQueue() {

        }

        @Override
        public void push(int x) {
            if (queue1.isEmpty()) {
                queue1.add(x);
                while(!queue2.isEmpty()) {
                    queue1.add(queue2.poll());
                }
            } else {
                queue2.add(x);
                while(!queue1.isEmpty()) {
                    queue2.add(queue1.poll());
                }
            }
        }

        @Override
        public int pop() {
            return getNotEmptyQueue().poll();
        }

        @Override
        public int top() {
            return getNotEmptyQueue().peek();
        }

        @Override
        public boolean empty() {
            return queue1.isEmpty() && queue2.isEmpty();
        }

        private Queue<Integer> getNotEmptyQueue() {
            return !queue1.isEmpty() ? queue1 : queue2;
        }

        @Override
        public String toString() {
            return "MyStack{" +
                    "queue=" + getNotEmptyQueue().toString() +
                    '}';
        }
    }

    static class MyStackWithOneQueue implements MyStack {

        private final Queue<Integer> queue = new ArrayDeque<>();

        @Override
        public void push(int x) {
            Integer[] arr = queue.toArray(new Integer[]{});
            queue.clear();
            queue.add(x);
            Collections.addAll(queue, arr);

        }

        @Override
        public int pop() {
            return queue.poll();
        }

        @Override
        public int top() {
            return queue.peek();
        }

        @Override
        public boolean empty() {
            return queue.isEmpty();
        }

        @Override
        public String toString() {
            return "MyStackWithOneQueue{" +
                    "queue=" + queue +
                    '}';
        }
    }
}
