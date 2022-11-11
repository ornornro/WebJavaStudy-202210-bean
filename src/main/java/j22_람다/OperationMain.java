package j22_람다;

public class OperationMain {
    public static void main(String[] args) {

        int a = 10, b = 20;

        Operation add = new Operation() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };

//        Operation add2 = (int x, int y) -> {
//            return x + y;
//        };
//        이 식을 밑에줄처럼 줄일 수 있다

        Operation add2 = (x, y) -> x + y; // 8번줄을 이 한 줄로 간추릴수 있다
        // 익명함수를 동시에 정의하고 생성한다 (객체가 들어갔다)
        // 람다는 (추상),(구현할)메소드를 딱 하나만 가진다 대신 default 메소드는 가능

//        Operation sub = (int x, int y) -> {
//            return x - y;
//        };
//        이 식을 밑에줄처럼 줄일 수 있다

        Operation sub = (x, y) -> x - y;

        Operation multi = (x, y) -> x * y;

        Operation div = (x, y) -> x / y;

        System.out.println(multi.resultToString(multi.calc(a, b)));

        System.out.println(div.resultToString(div.calc(b, a)));

        System.out.println(sub.resultToString(sub.calc(b, a)));

        int addResult = add.calc(a, b);
        System.out.println(a + "+" + b + "=" + addResult);

        int addResult2 = add2.calc(a, b);
        System.out.println(a + "+" + b + "=" + addResult2);


    }
}
