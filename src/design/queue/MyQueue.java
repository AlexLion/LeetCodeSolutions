package design.queue;

import java.util.Stack;

/*
  Implement the following operations of a queue using stacks.
  push(x) -- Push element x to the back of queue.
  pop() -- Removes the element from in front of queue.
  peek() -- Get the front element.
  empty() -- Return whether the queue is empty.
*/
public class MyQueue {
  private Stack<Integer> stack1;
  private Stack<Integer> stack2;
  private int count;

  /** Initialize your data structure here. */
  public MyQueue() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();
    count = 0;
  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    stack1.push(x);
    count++;
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    refill();
    count--;
    return stack2.pop();
  }

  /** Get the front element. */
  public int peek() {
    refill();
    return stack2.peek();
  }

  private void refill(){
    if(stack2.empty()){
      while(!stack1.empty()){
        stack2.push(stack1.pop());
      }
    }
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    return count == 0;
  }
}
