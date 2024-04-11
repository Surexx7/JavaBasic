public class ConstantExample {
    //static variable
    static int firststatic = 0;

    //Constant

    final int notChangeable = 100;
    //Instance variable

    int test = 1;

    public static void main(String[] args) {
        //Local variable
        String hello = "From CSIT THIRD";
        System.out.println("Hello Java" + hello);
        ConstantExample constantExample = new ConstantExample();

        System.out.println("Before Changing: " + ConstantExample.firststatic);
        ConstantExample.firststatic = 100;
        System.out.println("After Changing: " + constantExample.firststatic);
        System.out.println("Constant " + constantExample.notChangeable);

    }
}
