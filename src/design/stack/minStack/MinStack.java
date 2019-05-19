package design.stack.minStack;

import java.util.Arrays;


/*
  Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
  push(x) -- Push element x onto stack.
  pop() -- Removes the element on top of the stack.
  top() -- Get the top element.
  getMin() -- Retrieve the minimum element in the stack.
*/
public class MinStack {
  private Integer[] array;
  private int size;
  private int min;
  private int topId;

  /** initialize your data structure here. */
  public MinStack() {
    array = new Integer[8];
    topId = -1;
    min = Integer.MAX_VALUE;
  }

  public void push(int x) {
    if(size == array.length){
      array = Arrays.copyOf(array, size * 2);
    }
    array[++topId] = x;
    size++;
    if(min > x){
      min = x;
    }
  }

  public void pop() {
    if(size == 0){
      throw new RuntimeException("Stack is empty");
    }
    int deleted = array[topId];
    array[topId] = null;
    topId--;

    size--;
    if(deleted == min){
      resetMin();
    }
  }

  private void resetMin(){
    min = Integer.MAX_VALUE;
    for(int i = 0; i <= topId; i++){
      if(min > array[i]){
        min = array[i];
      }
    }
  }

  public int top() {
    if(topId < 0){
      throw new RuntimeException("Stack is empty.");
    }
    return array[topId];
  }

  public int getMin() {
    if(size == 0){
      throw new RuntimeException("Stack is empty");
    }
    return min;
  }
}
