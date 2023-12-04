package com.datastructure.Java.arfath;

import java.util.ArrayList;
import java.util.List;

public class MyHeapData<T extends Comparable<T>>
{
    private int heapSize=0;

    private int heapCapacity=0;

    private List<T> heap=null;

    public MyHeapData()
    {
        this(1);

    }

    public MyHeapData(int size)
    {
        heapCapacity=size;
        heap=new ArrayList<>(size);

    }


    public MyHeapData(T[] elems)
    {
        heapSize=heapCapacity=elems.length;
        heap = new ArrayList<T>(heapCapacity);

        for(int i=0;i<heapSize;i++) heap.add(elems[i]);

        for (int i=Math.max(0,(heapSize/2)-1);i>=0;i--) sink(i);

    }

    private void sink(int k)
    {
        while(true)
        {
            int left =2*k +1;
            int right =2*k +2;
            int smallest =left;

            if(right<heapSize && less(right,left)) smallest=right;

            if(left>= heapSize ||  less(k,smallest)) break;
            swap(smallest,k);
            k=smallest;

        }

    }


    private void swap(int i, int j) {
        T elem_i = heap.get(i);
        T elem_j = heap.get(j);

        heap.set(i, elem_j);
        heap.set(j, elem_i);
    }

    private boolean less(int i, int j) {
        T node1 = heap.get(i);
        T node2 = heap.get(j);
        return node1.compareTo(node2) <= 0;
    }

    public void insert(T elem)
    {

        if(elem == null) throw new IllegalArgumentException("something wrong ");

        if(heapSize<heapCapacity)
        {
            heap.set(heapSize,elem);
        }
        else {

            heap.add(elem);
        }

        swin(heapSize);
        heapSize++;
    }

    private void swin(int k) {

        int parent=(k-1)/2;

        while( k>0 &&  less(k,parent))
        {
            swap(parent,k);
            k=parent;

            parent=(k-1)/2;
        }
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}


