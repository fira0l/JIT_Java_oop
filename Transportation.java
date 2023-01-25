/*This code is written by Firaol Anbessa to illustrate nested class*/

import java.util.*;

public class Transportation {

    String Vehicle;
    String Animal;
    public class cars{
        String carName;
        String carModel;
        String Plateno;

    }

    public static void main(String[] args) {
        Transportation obj1 = new Transportation();//Here we created an object from outer class
        Transportation.cars obj2 = obj1.new cars();//Here we created an object of inner class from Outer class

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name of a car");
        String name = sc.nextLine();
        obj2.carName = name;
        System.out.println("Enter the  model");
        String model = sc.nextLine();
        obj2.carModel = model;
        System.out.println("Car name : " + obj2.carName);
        System.out.println("Car Model: " + obj2.carModel);

    }
}
