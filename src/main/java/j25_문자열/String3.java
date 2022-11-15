package j25_문자열;

public class String3 {
    public static void main(String[] args) {

        String phoneNumber = "010-6636-6145";

        String replacePhoneNumber =
                phoneNumber.replaceAll("-", "")
                        .replaceAll("/", "")
                        .replaceAll("_", "")
                        .replaceAll(" ", "");

        System.out.println(replacePhoneNumber);

    }
}
