package j17_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
public class Product {
    public static int autoIncrement = 20220000;

    private int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }

    public static void printInfo() {
        // System.out.println(productName); 맴버변수는 스태틱 메소드에서 사용할 수 없다.
        Product product = new Product("product");
        System.out.println(product.productName);
        System.out.println(autoIncrement);
    }

}
