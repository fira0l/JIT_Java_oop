
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class collection {

    public static void main(String[] args){
        LinkedList<String> names=new LinkedList<String>();
        names.add("Firaol");
        names.add("add");
        names.add("Meee");
        names.add("bro");

        System.out.println(names);
        Iterator it= names.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
