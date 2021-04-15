package tasks;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

import java.util.Collection;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {

        List<Integer> vals = Ints.asList(new int[] {4, 2, 5, 7});

        Collection<List<Integer>> orderPerm =
                Collections2.permutations(vals);

        for (List<Integer> val : orderPerm) {
            System.out.println(val);
        }



    }




}
