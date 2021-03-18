package core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@EqualsAndHashCode(doNotUseGetters = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @EqualsAndHashCode.Exclude private Integer id;
    private String name;
    private String description;

//    -163981117

}
