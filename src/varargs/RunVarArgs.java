package varargs;

public class RunVarArgs {
    static int SumOfInteger(String test, int... numbers){

        int sum=0;
        for (int i: numbers){
            sum +=i;
        }
        return sum;
    }

    static  int SumOfIntegersUsingArray(int[] numbers){
        int sum=0;
        for (int i : numbers){
            sum +=i;
        }
        return sum;
    }

    public static void main(String ...args) {
        int[] intArray ={1,2,3,4,5};
        System.out.println(SumOfIntegersUsingArray(intArray));
        System.out.println(SumOfInteger("Test", 1,2,3,4,5));

    }
}

