package polymerphism;

public class Sum {

        private int add(int a, int b){
            return a + b;
        }

        private int add(int a, int b, int c){
            return a+b+c;
        }
        private int add(int a, int b, int c, int d){
            return  a+b+c+d;

        }

        public static void main(String[] args) {
            Sum sum= new Sum();
            System.out.println("Sum of two numbers:" + sum.add( 10, 20));
            System.out.println("Sum of three numbers: " + sum.add(10,20,30));
            System.out.println("Sum of four numbers: " + sum.add(10, 20, 30, 40));

        }

    }

