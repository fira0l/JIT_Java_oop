import com.sun.tools.javac.Main;

public class Second {

    public static void main(String[] args){
        Each obj1=new Each(1723,"Mercedes");
        Each obj2=new Each(1710,"Bullshit");
        System.out.println(obj1.suming(10,50));
        System.out.println(obj2.sum(10));
        obj1.setName("Firaol");
        obj1.getName();
        System.out.println(obj1.getName());
    }
}
