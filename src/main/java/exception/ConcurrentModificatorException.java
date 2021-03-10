package exception;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcurrentModificatorException {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,3);
        List<String> strings = Arrays.asList("1","2","3");


        List<String> collected = integers
                .stream()
                .filter(i -> i != 2)
                .map(Object::toString)
                .collect(Collectors.toList());



//        integers.removeIf(i -> i == 2);

//        for (Integer integer : integers) {
//            integers.remove(1);
//        }


//        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext();) {
//            String string = iterator.next();
//            if(string == "2") {
//                iterator.remove();
//            }




    }


}
