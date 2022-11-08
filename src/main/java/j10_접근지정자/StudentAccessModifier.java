package j10_접근지정자;

public class StudentAccessModifier {

    private int code;
    private String name;

    public StudentAccessModifier(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("학번: " + this.code);
        System.out.println("이름: " + name);
    }

}
