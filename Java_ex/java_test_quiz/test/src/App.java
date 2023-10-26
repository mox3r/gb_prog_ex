import java.util.Iterator;
import java.util.LinkedList;




public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");

        
            System.out.println(ll);
            

        LinkedList<Object> ll1 = new LinkedList<>();
        
        Iterator<Object> iterator  = ll.descendingIterator();
        while (iterator.hasNext()){
            ll1.add(iterator.next());
        }

        
            System.out.print(ll1);
        


    }
}
