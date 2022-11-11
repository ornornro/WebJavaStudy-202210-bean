package j21_익명클래스;

public class AdditionMain1 {
    public static void main(String[] args) {

        Addition<String> stringAddition = new AdditionImpl<String>();
        // 인터페이스를 생성하기 위해서는 implements 를 만들어야한다 = 재정의의 목적

        String str = stringAddition.add("문자열");
        System.out.println(str);

        // 익명클래스
        Addition<Integer> integerAddition = new Addition<Integer>() { // 클래스에 이름이 없는 익명클래스
            // 한번만 구현해서 쓰다 버리겠다
            @Override
            public Integer add(Integer values) {

                return null;
            }

        };
    }
}
