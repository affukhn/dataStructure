package com.datastructure.Java.arfath;

import javax.xml.crypto.Data;

public class MyStack<T> {


    private class Stack<T>{
        T data;
        Stack next;
        Stack prev;

        public Stack(T data) {
            this.data=data;
        }
        public Stack() {

        }
    }
    private Stack<T> top=null;

    public  MyStack() {}
    public MyStack(T data)
    {
          top=new Stack();
            top.data=data;

    }
    public void Add(T data)
    {


        if(top==null)
        {
            top=new Stack<>(data);
            return;
        }
        else {
            Stack s=new Stack<>(data);
            top.next=s;
            s.prev=top;
            top=s;
        }


    }
    public  T peek()
    {
        return top.data;
    }
    public void pop()
    {
        if(top==null)
        {
            throw new NullPointerException("the pop method throw error ");
        }
        else
        {
            top=top.prev;
            top.next=null;
        }
    }
    public String toString()
    {
        StringBuilder b= new StringBuilder();
        b.append("[");
        b.append(top.data);
        Stack s=top.prev;
        while(s!=null)
        {
            b.append(",");
            b.append(s.data);

            s=s.prev;
        }
        b.append("]");
        return b.toString();


    }
}
