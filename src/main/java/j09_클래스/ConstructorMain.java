package j09_클래스;

public class ConstructorMain {
    public static void main(String[] args) {

        Constructor c1 = new Constructor();
        c1.showInfo();

        Constructor c2 = new Constructor(10);
        c2.showInfo();

        Constructor c3 = new Constructor(10, "김준일");
        c3.showInfo();

    }
}
