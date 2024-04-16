package functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestLambdaAndStream {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        person.setFullName("Ram Neupane");
        person.setAge(17);
        personList.add(person);

        Person person1 = new Person();
        person1.setFullName("Sita Neupane");
        person1.setAge(18);
        personList.add(person1);

        Person person2 = new Person();
        person2.setFullName("Hari Neupane");
        person2.setAge(22);
        personList.add(person2);

        List<Person> eligible = personList.stream()
                .filter(p -> p.getAge() >= 18).collect(Collectors.toList());

        eligible.forEach(p -> {
            System.out.println(p.getFullName());
            System.out.println(p.getAge());
        });

        Predicate<Person> predicate = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18;
            }
        };

        Predicate<Person> predicate1 = p -> p.getAge() >= 18;

        List<Person> eligible1 = personList.stream().filter(predicate)
                .collect(Collectors.toList());
        List<Person> eligible2 = personList.stream().filter(predicate1)
                .collect(Collectors.toList());
        List<Person> eligible3 = personList.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18;
            }
        }).collect(Collectors.toList());

        List<Integer> integerList = Arrays.asList(5, 6, 4, 7, 3, 8, 2, 9, 1,0);

        List<Integer> sortedIntegerList = integerList.stream().sorted().collect(Collectors.toList());

        List<Integer> evenIntegerList = integerList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddIntegerList = integerList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        List<Integer> squaredIntegerList = integerList.stream().map(n->n*n).collect(Collectors.toList());
        int sum=integerList.stream().mapToInt(n->n.intValue()).sum();
        int product=integerList.stream().reduce(1,(a,b)->a*b);

        System.out.println(sum);
        System.out.println(product);

        sortedIntegerList.forEach(System.out::println);

    }
}