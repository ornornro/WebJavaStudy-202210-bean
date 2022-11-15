package j25_문자열;

public class String5 {
    public static void main(String[] args) {

        String httpMethod = "Get";

        // equalsIgnoreCase 영문자를 대/소문자 구분없이!
        if(httpMethod.equalsIgnoreCase("gET")) {
            System.out.println("get 요청입니다.");
        }else {
            System.out.println("get 요청이 아닙니다.");
        }

    }
}
