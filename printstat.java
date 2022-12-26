import java.util.Scanner;

public class printstat {

   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the radius :");
        double r=sc.nextDouble();
        double pi=3.14159;
        double circumfrance;
        double Area;

        circumfrance=2*r*pi;
        Area=circumfrance*r;

        System.out.println("The Circumrance of a circle with radius: "+r+" is equal to: "+circumfrance);
        System.out.println("The Area of a circle with radius : "+r+" is equal to: "+Area);
    }
}
