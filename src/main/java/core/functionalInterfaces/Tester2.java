package core.functionalInterfaces;

import java.util.HashMap;
import java.util.Map;

public class Tester2 {
    public static void main(String[] args) {

        Map<String, Integer> nameMap = new HashMap<>();
        nameMap.put("John", 15);

        Integer value = nameMap.computeIfAbsent("John", s -> s.length());
        System.out.println(value);

        Integer value2 = nameMap.computeIfAbsent("John", Integer::getInteger);
        System.out.println(value2);

        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);

        salaries.replaceAll((name, oldValue) ->
                name.equals("Freddy") ? oldValue : oldValue + 10000);

        salaries.entrySet().stream() .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        Thread thread = new Thread(() -> {
            int i = 0;
            while(i < 100) {
                System.out.println(i++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();





    }


}
