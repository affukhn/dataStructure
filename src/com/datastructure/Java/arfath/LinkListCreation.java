package  com.datastructure.Java.arfath;
import org.w3c.dom.Node;

import javax.lang.model.element.Element;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class LinkListCreation<T> implements Iterable<T> {


    private static class List<T>{
         T value;
         List next;
         public List(T value)
         {
             this.value= value;
         }
    }

    public List head;
    public List tails;

    public T add(T element) {
        if (head == null) {
            head = new List<T>(element);
        } else {
            List<T> trail = head;
            while (trail.next != null) {
                trail = trail.next;
            }
            trail.next = new List<T>(element);

        }
       return element;
    }

    public boolean removeElement(T e)
    {
        if(head==null)
        {
            return false;
        }
        List<T> trails=head;
        List<T> remove=null;

        while(trails!=null)
        {
          T el= trails.value;
          if(el.equals(e))
          {
              if(remove==null){
                  head=trails.next;
              }
              else
              {
                remove.next=trails.next;
              }
              return true;

          }
          remove=trails;
          trails=trails.next;

        }
        return false;


    }

    public void addAtIndex(int index,T ele)
    {
        List<T> l=head;
        List p=null;
        List<T> newelme=new List<T>(ele);
        for(int i=0;i<index && l!=null;i++)
        {
            p=l;
            l=l.next;


        }
        p.next= newelme ;
        newelme.next=l;
    }

    public int indexOf(T ele)
    {
        List<T> l= head;
        int index=0;
        while(l!=null)
        {
            if(l.value==ele)
                return index;
            index++;
            l=l.next;
        }
        return -1;
    }


    public Iterator<T> iterator()
    {
        return new Iterator<T>() {
            private LinkListCreation.List<T> trav =head;

            @Override
            public boolean hasNext() {
                return trav!=null;
            }

            @Override
            public T next() {
                T data = trav.value;
                trav=trav.next;
                return data;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };


    }

    public String toString()
    {
        List trails=head;
        String s="";
        while(trails!=null)
        {

            s+=trails.value+" ";
            trails=trails.next;
        }

        return s;
    }

}
