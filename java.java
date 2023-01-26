/*Somehow it is unfinished i will inform u once i finshed it*/


package lab_class;

import java.util.Scanner;

interface engine{
    void start();
    void malfunction();
    void stop();
    void Roar();
    
}

public class Cars {
    String carname;
    String cartype;
    String Model;
    float platenumber;
    String Prcomponey;
Cars(float x,String...n){
    this.platenumber=x;
    this.carname=n[0];
    this.cartype=n[1];
    this.Model=n[2];
    this.Prcomponey=n[3];
}

void display(){
    System.out.println("Car name: "+carname);
    System.out.println("Car Type: "+cartype);
    System.out.println("Car Model: "+Model);
    System.out.println("Car PrCompony: "+Prcomponey);
    System.out.println("Car platenumber: "+platenumber);
    
}

abstract static class cartype extends Cars implements engine{

        public cartype(float x, String... n) {
            super(x, n);
        }
    
   public void start(){
        System.out.println("ehhhmmm ehhhmm");
    }
    public void malfunction(){
        System.out.println("noo nooo nooo");
    }
    public void stop(){
        System.out.println(" (-_-) ");
    }
   public void Roar(){
       System.out.println("Fired up hm hm hm hm ");
   }    


    
}
public static void main(String[] args){
    
    Cars.cartype me=new Cars.cartype();
    
    Cars car1=new Cars(5000,"Honda","CVbb","V","Toyota");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter carname\n cartype\n Model\n platenumber\n Prcomponey");
    System.out.println("Enter carname");
    String name=sc.nextLine();
    System.out.println("Enter cartype\n");
    String type=sc.nextLine();
    System.out.println("Enter Model\n");
    String model=sc.nextLine();
    System.out.println("Enter Prcomponey");
    String pr=sc.nextLine();
    System.out.println("Enter platenumber\n");
    float a=sc.nextFloat();
    
    car1.display();
    Cars car2=new Cars(a,name,type,model,pr);
    car2.display();
    
   
}

}


