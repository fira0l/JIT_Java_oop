public class Area {
    double length;
    double width;
    double height;

    class Rectangle extends Area{
        double Volume;
        double surface_area;
    }

    final class square extends Rectangle{

    }

    class circle extends Area{
        private static final double pi = 3.14159;
        double Radius;
        double circumfrance;
        double base;
    }

    Rectangle r1=new Rectangle();
    public static void main(String[] args){

    }
}
