package core.collections;

import core.model.Item;

public class HashEqualsTestClass {

    public static void main(String[] args) {

        Item item = new Item();
        item.setId(10);
        item.setName("Item1");
        item.setDescription("Description");

        System.out.println(item.hashCode());



    }


}
