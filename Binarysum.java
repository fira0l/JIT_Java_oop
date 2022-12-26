

import java.util.Scanner;

public class Binarysum {

   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the 1st num: ");
        String x = sc.nextLine();
        System.out.println("Enter the 2st num: ");
        String y = sc.nextLine();

        int n1=Integer.parseInt(x,2);
        int n2=Integer.parseInt(y,2);
        int n3=n1+n2;

        System.out.println("n1: "+Integer.toBinaryString(n1));
        System.out.println("n2: "+Integer.toBinaryString(n2));
        System.out.println("n3=n1+n2: "+Integer.toBinaryString(n3));
    }

}
