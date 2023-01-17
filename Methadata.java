public class Methadata <T,K> {
    T x;
    int y;
    K key;

    Methadata(T t,K k){
        this.x=t;
        this.key=k;
    }
   <Y> void displayAnyArray(Y[] anyarr){
        for (Y x:anyarr){
            System.out.println(x);
        }
   }
    public static void main(String[] args){
        Methadata<String,Integer> md1=new Methadata<String,Integer>("ABC",1001);
        //Methadata<Double,Integer> md2=new Methadata<Double,Integer>();
        String[]days={"Mon","Thue","WED","thrs"};
        md1.displayAnyArray(days);
        Integer []idnum={100,101,102,103};
        //md2.displayAnyArray(idnum);
    }

}
