package constructor;

public class Fruits extends Plant{
    private String name;

    //Explicit default constructor
    public Fruits(){
        System.out.println("You have no fruits");

    }

    // Parameterized constructor
    public Fruits(String name){
        this.name= name;
        System.out.println("You have: " + name);
    }
    //copy constructer
    public Fruits(Fruits fruits){
        this.name = fruits.name;
        System.out.println("You have: "+ fruits.name);
    }

    public static void main(String[] args){
        Fruits fruits = new Fruits( "Apple");
        Fruits fruits1= new Fruits(fruits);
    }

}
