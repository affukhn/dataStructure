package  com.datastructure.Java.arfath;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class myMain {
    public static void main(String[] args) {
          LinkListCreation<Integer> l= new LinkListCreation<Integer>();
          l.add(10);
          l.add(20);
          l.add(30);
          l.add(50);
          l.addAtIndex(3,40);
          Iterator itr=l.iterator();
          while (itr.hasNext())
          {
              System.out.println(itr.next());
          }


    }
}
