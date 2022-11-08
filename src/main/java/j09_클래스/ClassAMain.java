package j09_클래스;

public class ClassAMain {

    public static void main(String[] args) {
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());

        ClassA a1 = new ClassA();

        ClassA a2 = new ClassA();

        a1.name = "김준일";

        System.out.println(a1.name);

        a2.name = "김준이";

        System.out.println(a1.name);
        System.out.println(a2.name);

        a1.callName();

        a2.callName();

    }

}
