package com.stack;
class Node
{
int data;      
Node next;     
}

class Stack
{
private Node top;
private int nodesCount;

public Stack() {
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
public int peek()
{
   if (isEmpty()) {
       System.out.println("The stack is empty");
       System.exit(-1);
   }
   return top.data;
}
public int size() {
   return this.nodesCount;
}

}

public class StackUC1 {
public static void main(String[] args)
{
   Stack stack = new Stack();
   stack.push(56);
   stack.push(30);
   stack.push(70);
}
}