package  com.datastructure.Java.arfath;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class myMain {
    public static void main(String[] args) {
        Integer []a={1,2,6,4,7,5,9,3};
        MyHeapData<Integer> l=new MyHeapData<>(a);
        l.insert(5);
        l.insert(20);
        l.insert(0);
        System.out.println(l);





    }
}
