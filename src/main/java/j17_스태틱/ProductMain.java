package j17_스태틱;

import j08_메소드.Method1;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {
    private String name;

    public static void main(String[] args) {
        int autoIncrement = Product.getAutoIncrement();
        System.out.println(autoIncrement);
        System.out.println(Product.autoIncrement);
        Product.autoIncrement++;
        System.out.println(Product.getAutoIncrement());

        Product p1 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        Product p2 = new Product("p1");
        Product p3 = new Product("p1");
        Product p4 = new Product("p1");
        Product p5 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        System.out.println(p2.getAutoIncrement());
        System.out.println(p3.getAutoIncrement());
        System.out.println(p4.getAutoIncrement());
        System.out.println(p5.getAutoIncrement());
        System.out.println(Product.getAutoIncrement());

        System.out.println(PathRepository.PRODUCT_IMG_PATH);
        System.out.println(PathRepository.PROFILE_IMG_PATH);
        System.out.println(PathRepository.MAIN_IMG_PATH);

        Product.printInfo();

        ProductMain productMain = new ProductMain();

        productMain.setName("테스트");
        System.out.println(productMain.getName());

        Method1.main(new String[] {});
        Method1.call1();
    }

}
