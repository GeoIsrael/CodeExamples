package brainway;

import java.util.LinkedHashMap;
import java.util.Map;

public class LimitedHashMap {
    public final Integer MAX_SIZE = 3;
    static Long removeCandidateTime;

    Map<String,String> limitedMap = new LinkedHashMap<>();
    Map <Long, String> te = new LinkedHashMap<>();
    Map <String, Long> et = new LinkedHashMap<>();


    public void putItem (String key, String value) {
        //случай 1 -> карта пустая
        if (limitedMap.size() == 0) {
            removeCandidateTime = System.nanoTime();
            saveData(key, value, removeCandidateTime);

        // случай 2 -> есть место, добавляемый элемент совпадает с ключем кандидата на удаление
        // удаляем кандидата на удаление, определяем нового кандидата на удаление, добавляем элемент
        } else if (limitedMap.size() < MAX_SIZE && te.get(removeCandidateTime) == key){
            deleteCandidate();
            removeCandidateTime = getOlderElementTime();
            saveData(key, value, System.nanoTime());

        //случай 3 -> есть место для добавления
        } else if (limitedMap.size() < MAX_SIZE){
            saveData(key, value, System.nanoTime());

        //случай 4 -> места для добавления нет, удаляем кандидата на удаление, определяем нового кандидата на удаление,
//            добавляем новый элемент
        } else {
            deleteCandidate();
            removeCandidateTime = getOlderElementTime();
            saveData(key, value, System.nanoTime());
        }


    }


    private Long deleteCandidate() {
        String key = te.get(removeCandidateTime);
        System.out.println("delete " + key + " " + limitedMap.get(key) + " " + removeCandidateTime);
        te.remove(removeCandidateTime);
        et.remove(key);
        limitedMap.remove(key);
        return getOlderElementTime();
    }

    //определяем новое время кандидата на удаление
    private Long getOlderElementTime() {
        return te.entrySet().stream().map(e -> e.getKey()).findFirst().orElse(null);
    }


    public String deleteItem (String key) {
        return limitedMap.remove(key);
    }

    public String getItem(Integer i) {
        return limitedMap.get(i);
    }



    private void saveData(String key, String value, Long time) {
        limitedMap.put(key,value);
        te.put(time, key);
        et.put(key, time);
        System.out.println("add " + key + " " + value + " " + time);
    }

    public void printMap () {
        limitedMap.entrySet().stream().forEach(System.out::println);
    }



}
