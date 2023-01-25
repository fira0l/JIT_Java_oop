import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Iterator;
public class Practice{
        public static void main(String[] args){
        LinkedList<String> i=new LinkedList<String>();
        i.add("A");
        i.add("B");
        i.addLast("C");
        i.add(2,"B");
        System.out.println(i);
        i.remove(2);
        System.out.println(i);

        Collection<String> coll=new ArrayList<String>();
        coll = new TreeSet<String>();
        int n= coll.size();
        coll.add("Fira");
        coll.add("Max");
        String s=coll.toString();
        System.out.println(coll);
        boolean b=coll.remove("Tom");



    }

}
