package functionalInterface;

public class RunFunctionalInterface {

    RunFunctionalInterface() {
        System.out.println("Create using constructor referenece");
    }


    public void printHello() {
        System.out.println("hello!");
    }

    public static void main(String[] args) {
//        TestFunctionalInterface testFunctionalInterface = RunFunctionalInterface::new;
//        RunFunctionalInterface runFunctionalInterface = testFunctionalInterface.createInstance();
//        runFunctionalInterface.printHello();

        TestFunctionalInterface performAddition=((a,b) -> a+b);
         TestFunctionalInterface performSubtraction= ((a,b) -> a-b);

        TestFunctionalInterface.hello();
          performAddition.printResult(performAddition.performArithmeticOperations(1,2));

        performAddition.printResult(performSubtraction.performArithmeticOperations(3,1));
    }
}