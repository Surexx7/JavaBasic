package inheritance;

public class MultipleInheritance implements FirstInterface, SecondInterface{
    @Override
    public void displayFirst(){
        System.out.println("This is from FirstInterface");
    }

    @Override
    public void displaySecond(){
        System.out.println("This is From SecondInterface");
    }

    public static void main(String[] args){
        MultipleInheritance multipleInheritance =new MultipleInheritance();
        multipleInheritance.displayFirst();
        multipleInheritance.displaySecond();
    }
}
