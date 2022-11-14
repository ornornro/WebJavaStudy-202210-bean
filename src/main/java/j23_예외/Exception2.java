package j23_예외;

public class Exception2 {

    public  static void printArray(int[] numbers) throws Exception {

        for(int i = 0; i < numbers.length + 1; i++) {
            System.out.println("/" + numbers[i]);
        }

    }

    public static void main(String[] args) {

        if(1 == 1) {
            try {
                throw new RuntimeException("예외 강제 생성");
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("런타임 예외 처리");
            }catch (Exception e) {
                e.printStackTrace(); // 예외를 알려줌
            }finally {
                System.out.println("예외가 발생 하든 하지 않든 실행"); // 프로그램이 정상적으로 종료되지않아도 실행한다
            }
        }
        System.out.println("프로그램 정상 종료");

//        try {
//            printArray(new int[] {1, 2, 3, 4, 5});
//        }catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//         throw(위에 throws 와 다른것) 예외를 강제적으로 생성

//        System.out.println("프로그램 정상 종료");

    }
}
