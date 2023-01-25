//This is a java code on different points made while practicing

import java.util.Scanner;


public class Each {

    private String mname; //Encapsulation of A variable
    int modelYear;
    String modelName;

    public String getName(){    //using get()method to return the encapsulated var
        return mname;
    }

    public void setName(String setname){    //using set()method to makechanges to the encapsulated var
        this.mname=setname;
    }

    public Each(int year,String name){
        modelName=name;
        modelYear=year;
    }

    static void checkAge(int age){  //This is a method to check an if function in a method
        String result=(age<18)?"You are not permitted !!!":"You can Access it";
        System.out.println(result);
    }

    static int sum(int k){      //Recursive method that will sum up numbers
        if(k>0){
            return k+sum(k-1);
        }
        else
            return 0;
    }

     public static int summ(int k){  //Recursive method that will sum up numbers
        if(k>0)
        {
            return k+summ(k-1);
        }
        else
            return 0;
    }
    static int suming(int start,int end){    //Recursive method that will sum up numbers
        if(end>start)
        {
            return end+suming(start,end-1);
        }
        else
            return end;

    }
    public static void main(String[] args){
        String[] cars={"BMW","Alpha Romeo","Lamborghini","Porsche","Toyota","Mercedes"};
        String[][] newcars={{"Vits","Lotus","volsewagen"},{"Truck","Bus","Plane"}};
        for(int i=0;i< newcars.length;i++) {        //This for loop is used to print out elements of 2D array
            for (int j = 0; j < newcars[i].length; j++) {
                System.out.println(newcars[i][j]);
            }
        };
        for(String mycar:cars)  //This A for-Each loop
        System.out.println(mycar);
        System.out.println(cars.length);
        int x=5,y=10;
        String result=(x>y)?"X is larger than y":"Y is greater than x";  //This shorthand of an if condition
        System.out.println(result);

        checkAge(20);
        int summation=suming(50,100);
        System.out.println(sum(100));
        System.out.println(summation);

        Each myObj=new Each(1936,"Mustang");
       System.out.println(myObj.summ(10));
       System.out.println(summ(10));
       System.out.println(myObj.modelName);

       Scanner sc=new Scanner(System.in);  //creates an object named sc from scanner class
       String maname=sc.nextLine();         // accepts a String from a user and assign it to maname
       System.out.println(maname);          //Prints out the value that was accepted from the user
    }
}
