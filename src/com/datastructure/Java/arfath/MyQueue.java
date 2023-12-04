package com.datastructure.Java.arfath;

import java.util.Queue;

public class MyQueue<T>
{

    private class QueueData<T>
    {
        T data;
         QueueData next;

    }

    private QueueData<T> top;
    private QueueData<T> tail;


    public MyQueue() {
    }
    public MyQueue(T data)
    {
        top=new QueueData<>();
        tail=top;
        top.data=data;
    }

    public void offering(T data)
    {
        if(top==null)
        {
            top=new QueueData<>();
            tail=top;
            top.data=data;
            return;
        }

        QueueData s=new QueueData<T>();
        tail.next=s;
        s.data=data;
        tail=s;

    }
    public T polling()
    {
        T d=top.data;
        top=top.next;
        return  d;
    }

    @Override
    public String toString() {
        StringBuilder b= new StringBuilder();
        b.append("[");
        QueueData s= top;
        b.append(s.data);
        while(!s.equals(tail))
        {
           b.append(",");
           s=s.next;
           b.append(s.data);
        }
        b.append("]");
        return b.toString();
    }
}
