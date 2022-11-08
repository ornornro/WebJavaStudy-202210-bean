package j09_클래스;

public class Constructor {

    int num;
    String name;

    Constructor() {
        System.out.println("NoArgsConstructor(기본 생성자)");
    }

    Constructor(int num) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로하는 생성자)");
        this.num = num;
    }

    Constructor(String name) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로하는 생성자)");
        this.name = name;
    }

    Constructor(int num, String name) {
        System.out.println("AllArgsConstructor(전체 생성자)");
        this.num = num;
        this.name = name;
    }

    void showInfo() {
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }

}












