package j23_예외;

// 에외는 오류가 났을떄 당황하지말고 오류를 천천히 읽어보기
public class Exception1 {
    public static void main(String[] args) {

        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7};

        try {

            String a = null;
            a.toLowerCase();

            for (int i = 0; i < 8; i++) {
                System.out.println(numbers[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외를 처리하였습니다.");
        }catch (NullPointerException e) {
            System.out.println("null pointer to exception");
        }finally {
            System.out.println("항상 실행되어야 하는 서비스");
        }
        // try 에서 예외를 던지면 catch 가 받는다 exception 을 상속 받아야지만 들어올 수 있다

        System.out.println("프로그램 정상 종료");

    }
}
