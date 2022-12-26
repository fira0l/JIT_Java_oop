public class Swap {
    public static void main(String[] args){
        int x=10,y,z=5;
        System.out.println("The number x before swap is: "+x);
        System.out.println("The number z before swap is: "+z);

        y=x;
        x=z;
        z=y;
        System.out.println("The number x After swap is: "+x);
        System.out.println("The number z After swap is: "+z);

    }
}
