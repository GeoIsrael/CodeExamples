package core.comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product implements Comparable {

    Integer id;
    String name;
    Integer serialNumber;
    Double price;


//    @Override
//    public int compareTo(Product o) {
//        return this.id.compareTo(o.id);

//    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
