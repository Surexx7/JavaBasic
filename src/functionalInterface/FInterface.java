package functionalInterface;

public class FInterface {

    interface Operation {
        int perform(int a, int b);
    }

    public static void main(String[] args) {
        Operation add = new Operation() {
            @Override
            public int perform(int a, int b) {
                return a + b;
            }
        };
        Operation subtract = new Operation() {
            @Override
            public int perform(int a, int b) {
                return a - b;
            }
        };
        System.out.println(process(add, 2, 3));
        System.out.println(process(subtract, 3, 2));

        Operation add1 = (a, b) -> a + b;
        Operation subtract1 = (a, b) -> a - b;
        System.out.println(process(add1, 2, 3));
        System.out.println(process(subtract1, 3, 2));

        System.out.println(process((a, b) -> a + b, 2, 3));
        System.out.println(process((a, b) -> a - b, 3, 2));

    }

    static int process(Operation operation, int a, int b) {
        return operation.perform(a, b);
    }
}