package functionalInterface;

public interface TestFunctionalInterface {
    int performArithmeticOperations(int a, int b);

    //RunFunctionalInterface createInstance();

    default void printResult(int result){
        System.out.println("Result: "+ result);
    }

    static void hello(){
        System.out.println("Hello!");
    }
}
