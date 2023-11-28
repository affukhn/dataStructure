package  com.other;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hacod {
    public static void main(String[] args) {

        Map<Integer,String> m= new HashMap<Integer,String>();
        m.put(10,"good");
        m.put(20,"night");
        m.put(30,"work");
        m.put(40,"load");
        m.put(50,"make uo");
        m.put(60,"cool");

        for(Map.Entry m1:m.entrySet())
        {
            System.out.println(m1.getKey()+" "+m1.getValue());
        }

        Map<Integer,String> m2=new TreeMap<Integer,String>(m);
        System.out.println(m2);

    }
}
