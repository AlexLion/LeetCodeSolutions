package design.stack.withQueues;

import java.util.LinkedList;
import java.util.Queue;

/*
  Implement the following operations of a stack using queues.
  push(x) -- Push element x onto stack.
  pop() -- Removes the element on top of the stack.
  top() -- Get the top element.
  empty() -- Return whether the stack is empty.
*/
public class MyStack {
  private Queue<Integer> queue1;
  private Queue<Integer> queue2;
  private int top;
  private int count;

  /** Initialize your data structure here. */
  public MyStack() {
    queue1 = new LinkedList<>();
    queue2 = new LinkedList<>();
  }

  /** Push element x onto stack. */
  public void push(int x) {
    queue1.offer(x);
    count++;
    top = x;
  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {
    int size = queue1.size();
    if(size == 0){
      throw new RuntimeException("Stack is empty");
    }
    while(size > 1){
      top = queue1.poll();
      queue2.offer(top);
      size--;
    }
    count--;
    int item = queue1.poll();

    Queue<Integer> temp = queue2;
    queue2 = queue1;
    queue1 = temp;

    return item;
  }

  /** Get the top element. */
  public int top() {
    return top;
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return count == 0;
  }
}
