package generics;

import java.util.Arrays;
import java.util.List;

public class GenericsExample<T> {

    private T genericField;

    public T getGenericField() {
        return genericField;
    }

    public void setGenericField(T genericField) {
        this.genericField = genericField;
    }

    public <K> boolean isEqual(K value1, K value2) {
        return value1.equals(value2);
    }

    public <L extends Number & Comparable<L>> L
    findLargest(List<L> numberList) {
        L largest = numberList.get(0);
        for (int i = 1; i < numberList.size(); i++) {
            if (numberList.get(i).compareTo(largest) > 0) {
                largest = numberList.get(i);
            }
        }
        return largest;
    }

    public void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        GenericsExample<Integer> integerGenericsExample = new GenericsExample<>();
        integerGenericsExample.setGenericField(2);
        System.out.println("genericField value: " +
                integerGenericsExample.getGenericField());

        System.out.println(integerGenericsExample.isEqual(2, 2));

        GenericsExample<String> stringGenericsExample = new GenericsExample<>();
        stringGenericsExample.setGenericField("Hello");
        System.out.println("genericField value: "
                + stringGenericsExample.getGenericField());

        System.out.println(stringGenericsExample.isEqual("Ram", "Ram"));

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<String> stringList = Arrays.asList("Hello", "There!", "What's up?");

        integerGenericsExample.printList(integerList);
        integerGenericsExample.printList(stringList);

        System.out.println("Largest integer number= "
                + integerGenericsExample.findLargest(integerList));
        List<Double> floatList = Arrays.asList(1.1, 1.6, 1.5, 2.2, 1.9);
        System.out.println("Largest double number= "
                + integerGenericsExample.findLargest(floatList));


    }
}