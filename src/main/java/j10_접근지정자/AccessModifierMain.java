package j10_접근지정자;

public class AccessModifierMain {
    public static void main(String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(20220001, "김준일");

        sam.showInfo();
        sam.setName("김준이");
        sam.showInfo();

        System.out.println(sam.getCode());
    }
}
