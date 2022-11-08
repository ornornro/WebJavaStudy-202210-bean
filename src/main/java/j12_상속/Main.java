package j12_상속;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
        Human human = new Human("김준일");
        Tiger tiger = new Tiger("나비");

//        animal.move();
        human.move();
        tiger.move();

        System.out.println("사람의 이름: " + human.getName());
        System.out.println("호랑이의 이름: " + tiger.getName());

    }
}
