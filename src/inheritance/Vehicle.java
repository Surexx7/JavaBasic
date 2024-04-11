package inheritance;

public class Vehicle {

    public void display(){
        System.out.println("I am vehicle class");

    }

    public static void main(String[]args){
        Bike bike= new Bike();
        bike.display();

        Car car=new Car();
        car.display();
        Vehicle vehicle1=new Bike();
        vehicle1.display();

        Vehicle vehicle2=new Car();
        vehicle2.display();
    }
}
