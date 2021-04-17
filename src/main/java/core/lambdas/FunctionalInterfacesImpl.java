package core.lambdas;

import java.util.function.*;

public class FunctionalInterfacesImpl {

    public static void main(String[] args) {

        MyFunctionalInterface lambda = () -> {
            System.out.println("Executing...");
        };

        lambda.execute();


//        Function<Long, Long> adder = new AddThree();
//        Long result = adder.apply((long) 4);
//        System.out.println("result = " + result);


        Function<Long, Long> adder = (value) -> value + 3;
        Long resultLambda = adder.apply(8L);
        System.out.println("resultLambda = " + resultLambda);


        Predicate predicate = (value) -> value != null;


        UnaryOperator<Person> unaryOperator =
                (person) -> { person.name = "New Name"; return person; };

        System.out.println(unaryOperator.apply(new Person()).name);

        BinaryOperator<String> binaryOperator =
                (value1, value2) -> { String v = value1.concat(value2); return v; };

        System.out.println(binaryOperator.apply("1","23"));

        Supplier<Integer> supplier = () -> new Integer ((int) (Math.random () * 1000D));
        System.out.println(supplier.get());

        Consumer<Integer> consumer = (value) -> System.out.println(value);

        consumer.accept(5);




    }


}
