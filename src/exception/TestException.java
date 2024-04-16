package exception;

public class TestException {
    public static void main(String[] args) {
        int[] arrayOfInteger=new int[10];
        try{
            for (int i=0; i<=10; i++){
                arrayOfInteger[i]=i;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array size couldnot hold the data provided");
        } finally {
            System.out.println("It is also executed");


        }
        System.out.println("It is CSIT THIRD");
    }
}
