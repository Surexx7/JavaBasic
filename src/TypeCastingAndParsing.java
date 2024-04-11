public class TypeCastingAndParsing {

    public static void main (String[] agrs){
    //Implict type Casting
        int i= 10;
        float f= i;
        double d= i;
        long l= i;
        System.out.println("Float Value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Long Value: " + l);

        //Explic type casting

        double test = 1999991.9119;
        float fTest= (float) test;
        int iTest= (int) fTest;
        System.out.println("Float Value: " + fTest);
        System.out.println("Int Value: " + iTest);

        //Parsing
        String intString= "10";
        String floatString = "10.1";
        String doubleString = "10.11";
        System.out.println("Int Value: " + Integer.parseInt(intString));
        System.out.println("Float Value " + Float.parseFloat(floatString));
        System.out.println("Double Value: " + Long.parseLong(doubleString));

    }

}
