package j22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // Runnable
        Runnable runnable = () -> { // return 이 없이니 무조건 중괄호를 열어라!
            System.out.println("첫번째 프로그램을 실행합니다.");
        };

        Runnable runnable2 = () -> { // return 이 없이니 무조건 중괄호를 열어라!
            System.out.println("첫번째 프로그램을 실행합니다.");
        };

        runnable.run();
        runnable2.run();

        // thread 에서 가장 많이 쓰인다!

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드1: " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드2: " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }); // -> 람다로 구현

//        thread1.start();
//        thread2.start();
//        프로그램이 동시에 돌기 때문 원래 프로그램은 순차적

        Supplier<String> supplier = () -> "공급";
        System.out.println(supplier.get());

        Consumer<String> consumer = name -> { // 매개변수가 하나면! 소괄호도 생략 가능 없거나 두개는 X
            System.out.println("이름: " + name);
        };

        consumer.accept("이동빈");

        Function<Integer, String> function = age -> "나이: " + age;
        System.out.println(function.apply(25));

        Predicate<Integer> leapMonth = year -> year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(leapMonth.test(2000));

    }
}
