package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {


    public static void main(String[] args) {

        List <Integer> collection = Arrays.asList(1,10,100,1000);
        Integer sumOdd = collection.stream().filter(o -> o % 2 == 0).reduce((s1, s2) -> s1 + s2).orElse(0);
        System.out.println(sumOdd);




//        new Random().ints(1_000_000, 1, Integer.MAX_VALUE)    //генерируем поток на миллион цифр
//                .flatMap(n->Integer.toString(n).chars())              //перегоняем число в строку и разбиваем по символам
//                .boxed()                                              //делаем из каждого символа объект (чтобы char превратился в character
//                .collect(Collectors.groupingBy(n->n, Collectors.counting()))  //собираем объекты в мепу  ключ сам символ а значение количество символов в числе
//                .entrySet().stream()                                   //преобразовываем для сортировки в энтрисет и запускаем поток
//                .sorted((e1,e2)->Long.compare(e2.getValue(), e1.getValue()))    //сортируем поток по value (от большего к меньшему в обраном порядке
//                .forEach(e->System.out.printf("%c -> %d\n", e.getKey(), e.getValue()));    //распечатываем (%c нужен для представления как символ character
//






//        List<Integer> lists = new Random().ints(1,10)
//               .boxed().limit(5).peek(System.out::println).collect(Collectors.toList());
//        lists.stream().collect(Collectors.groupingBy(e->e, TreeMap::new, Collectors.toList()))
//                .entrySet().forEach(System.out::println);



//        List<Integer> lists = new Random().ints(1,10)
//                .boxed().limit(5).collect(Collectors.toList());
//        Integer i = lists.stream().peek(System.out::println).reduce(0, (max, cur) -> cur > max ? cur : max);
//        System.out.println(i);




//        List<Integer> lists = new Random().ints(1,10)
//                .boxed().limit(5).collect(Collectors.toList());
//        Integer i = lists.stream().collect(Collectors.maxBy((v1,v2)->Long.compare(v1, v2))).orElse(0);
//        System.out.println(i);





//        List<Integer> lists = new Random().ints(1,10)
//                .boxed().limit(5).collect(Collectors.toList());
//        IntStream.range(0, lists.size())
//                .forEach(i->System.out.printf("%d -> %d\n", i, lists.get(i)));



//        Arrays.stream("jhgdshskkd".split(""))
//            .collect(Collectors.groupingBy(s->s,Collectors.counting()))
//            .forEach((k,v)->System.out.printf("%s -> %d\n",k,v));



//        List<Integer> lists = new Random().ints(1,10)
//            .boxed().limit(10).collect(Collectors.toList());
//        lists.stream().collect(Collectors.groupingBy(n->n%2==0?"even":"odd", Collectors.summingInt(n->n)))
//                .forEach((k,v)->System.out.printf("%s:%d\n",k,v));


//        Stream.generate(()->new Random().ints(1, 1, 200))
//                .limit(5)
//                .collect(Collectors.toList()).forEach(i -> i.forEach(System.out::println));


//        List<Integer> lists = new Random().ints(-100,100)
//            .boxed().limit(100).collect(Collectors.toList());
//        System.out.println(lists);

//        List<List<Integer>> globalList = new ArrayList<>();
//        for (int i = 0; i <3; i ++) {
//            globalList.add(new Random().ints(-100,100)
//                    .boxed().limit(5).collect(Collectors.toList())); }
//        globalList.stream().flatMap(List::stream)
//                .collect(Collectors.partitioningBy(n->n%2==0))
//                .forEach((k,v)->System.out.println(k +" -> " + v));


//        List<List<Integer>> globalList = new ArrayList<>();
//        for (int i = 0; i <3; i ++) {
//            globalList.add(new Random().ints(-100,100)
//                    .boxed().limit(5).collect(Collectors.toList())); }
//        Long s = globalList.stream().flatMap(List::stream)
//                .mapToLong(n->n.longValue()).sum();
//        System.out.println(s);



//        String[] words = "Hello how are you you are are".split(" ");
//        Map<String,Long> map = Arrays.stream(words)
//            .collect(Collectors.groupingBy(s->s,Collectors.counting()));
//        map.forEach((k,v) -> System.out.println(k + "->" + v));


//        String[] words = "hello how are you you are are".split(" ");
//        Map<String,Long> map = Arrays.stream(words)
//            .collect(Collectors.groupingBy(s->s,Collectors.counting()));
//        map.entrySet().stream()
////                .sorted((e1,e2)->e1.getValue().compareTo(e2.getValue()))
//                .sorted((e1,e2)->e1.getKey().compareTo(e2.getKey()))
//                .forEach(e->System.out.println(e.getKey() + " -> " + e.getValue()));

    }




}
