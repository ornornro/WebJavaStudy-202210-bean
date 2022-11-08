package j05_Scanner;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("x입력: ");
        int x = scanner.nextInt();

        System.out.print("y입력: ");
        int y = scanner.nextInt();

        System.out.println("x + y = " + (x + y));


    }
}
