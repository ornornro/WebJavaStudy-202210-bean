package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
        // upcasting(업캐스팅)
        char cast1 = 'a';
        System.out.println((int) cast1);
        int cast2 = cast1;
        System.out.println(cast2);

        //downcasting(다운캐스팅)
        int cast3 = 98;
        char cast4 = (char) cast3;
        System.out.println(cast4);

        double cast5 = 3.14;
        int cast6 = (int) cast5;
        System.out.println(cast6);
        double cast7 = cast6;
        System.out.println(cast7);

    }
}










