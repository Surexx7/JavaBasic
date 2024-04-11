public class Variable {
    //static variable
    static int firstStatic = 100;

    //Constant
    final int notChangeable= 100;

    //Instance Variable
    int test= 1;

    //Function
    public void display()
    {
        //Local Variable
        String hello= "JAVA CLASS";
        System.out.println("Hello Java!"+ hello);
    }

    public static void main(String[] args) {
        Variable v=new Variable();
        System.out.println(Variable.firstStatic);

        //v.notChangeable++;
        Variable.firstStatic++;
        System.out.println(Variable.firstStatic);
    }
}
