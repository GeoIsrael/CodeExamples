package core.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsClass {

    public static void main(String[] args) {

        List<String> list = new ArrayList <>();

        list.add("one");
        list.add("two");
        list.add("three");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println( element );
        }


        list.forEach( (element) -> {
            System.out.println( element );
        });

    }
}
