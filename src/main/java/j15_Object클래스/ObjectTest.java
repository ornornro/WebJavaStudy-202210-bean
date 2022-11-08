package j15_Object클래스;

/*
 * 모든 클래스는 Object 클래스를 상속받는다.
 *
 */
public class ObjectTest extends Object {

    private String name;
    private String address;

    public ObjectTest() {}

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String showInfo() {
        return "name: " + name + ", address: " + address;
    }

    @Override
    public String toString() {
        return "name: " + name + ", address: " + address;
    }
}









