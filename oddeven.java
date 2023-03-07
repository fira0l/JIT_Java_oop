import java.util.Scanner;

public class oddeven {
   public String checkNumber(int z){ //this is a method to check whether a number is odd or even
        if(z%2==0)           //here the module sign is used to check if there is a reminder after a number is divided by 2
            return "Even";
        else
            return "Odd";
    }

     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);       //here we declare an object for Scanner class

        System.out.println("Enter any number: ");
         int x= sc.nextInt();                   //here we accept a number form a user
         oddeven obj1=new oddeven();            //Here we declare an oddeven class object to access a method
         System.out.print("The number u entered "+ x + " is " );
         System.out.println(obj1.checkNumber(x));

   }
}
