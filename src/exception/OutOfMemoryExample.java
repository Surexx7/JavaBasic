package exception;

import java.util.ArrayList;
import  java.util.List;


public class OutOfMemoryExample {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();

        try{
            while (true){
                numbers.add(42);
            }
        } catch (OutOfMemoryError e){
            e.printStackTrace();
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
        }

    }
}
