package j15_Object클래스;

public class StringEquals {

    public static void main(String[] args) {
        int i = 10;

        String name1 = "김준일";
        String name2 = "김준일";
        String name3 = new String("김준일");
        String name4 = new String("김준일");

        System.out.println(name1 + ", " + name2 + ", " + name3);

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name3 == name4);
        System.out.println(name1.equals(name3));
    }

}
