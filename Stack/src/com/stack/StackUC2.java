package com.stack;
class Node1
{
int data;       // integer data
Node next;      // pointer to the next node
}

class Stack1
{
private Node top;
private int nodesCount;
public Stack1() {
   this.top = null;
   this.nodesCount = 0;
}
public void push(int x)        
{
   Node node = new Node();
   if (node == null)
   {
       System.out.println("Heap Overflow");
       return;
   }

   System.out.println("Inserting " + x);
   node.data = x;
   node.next = top;
   top = node;
   this.nodesCount += 1;
}
public boolean isEmpty() {
   return top == null;
}
public int peak()
{
   if (isEmpty()) {
       System.out.println("The stack is empty");
       System.exit(-1);
   }
   return top.data;
}
public int pop()      
{
   if (isEmpty())
   {
       System.out.println("Stack Underflow");
       System.exit(-1);
   }
   int top = peak();
   System.out.println("Removing " + top);
   this.nodesCount -= 1;
   this.top = (this.top).next;

   return top;
}
public int size() {
   return this.nodesCount;
}
}

public class StackUC2 {
public static void main(String[] args)
{
   Stack1 stack = new Stack1();

   stack.push(56);
   stack.push(30);
   stack.push(70);

   System.out.println("The top element is " + stack.peak());

   stack.pop();
   stack.pop();
   stack.pop();

   if (stack.isEmpty()) {
       System.out.println("The stack is empty");
   }
   else {
       System.out.println("The stack is not empty");
   }
}
}