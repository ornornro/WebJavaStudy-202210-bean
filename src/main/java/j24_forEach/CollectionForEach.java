package j24_forEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

        for(String name : list) {
            System.out.println(name);
        }

        list.forEach(name -> {
            System.out.println(name);
        });

        System.out.println();

        Consumer<String> c = new Consumer<String>(){
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        };

        // 위 단락이 너무 길어서 밑에 람다식으로 줄여줄 수 있다

        Consumer<String> consumer = name -> {
            System.out.println(name);
        }; // ; 을 찍는 이유 =

        for(String name : Objects.requireNonNull(list)) { // 고정값으로 5번 반복
            consumer.accept(name);
        }

        list.forEach(name -> {
            System.out.println(name);
        });

        Set<Integer> numbers = new HashSet<Integer>();
        for(int i = 0; i < 100; i++) {
            numbers.add(i + 1);
        }

        AtomicInteger result = new AtomicInteger();

        numbers.forEach(num -> {
            result.addAndGet(num); // result 가 가지고있는 값을 가지고 와서 더해라
        });

        System.out.println(result.get());

        Map<Integer, String> students = new TreeMap<Integer, String>();

        for(int i = 0; i < 10; i++) {
            students.put(20220001 + i, "김준" + (i + 1));
        }

        students.forEach((key, value) -> {
            System.out.println("학번: " + key + ", 이름: " + value);
        });

    }
}
