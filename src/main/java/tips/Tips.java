package tips;

import java.util.ArrayList;
import java.util.List;

public class Tips {

    public static void main(String[] args) {





    }

    //reserve memory
//    export JAVA_OPTS="$JAVA_OPTS -Xms5000m -Xmx6000m -XX:PermSize=1024m -XX:MaxPermSize=2048m"

    //NOT RETURN NULL
    private List Employees;
    public List getEmployees() {
        //initialize only when required
        if(null == Employees) {
            Employees = new ArrayList();
        }
        return Employees;
    }

    //NOT RETURN NULL
    public String getLocationName () {
        String cityName = " ";
        return (null==cityName ? "": cityName);
    }

}
