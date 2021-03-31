package interview.immutableSet;

import java.util.Arrays;

public class Controller {


    public static void main(String[] args) {

        ImmutableSet immutableSet = ImmutableSet.fromCollection(Arrays.asList(1,2,3,4,9));

        System.out.println(immutableSet.hashCode());

        System.out.println(immutableSet.equals(ImmutableSet.fromCollection(Arrays.asList(1,2,3,4,9))));




    }
}
