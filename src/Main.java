import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kancha kg alma satyldy? ");
        Fruit apple = new Apple(5, 2);
        apple.Cell();
        System.out.println(apple);
        System.out.println("Kancha kg apricot satyldy? ");
        Fruit apricot = new Apricot(6, 3);
        apricot.Cell();
        System.out.println(apricot);
        System.out.println("Kancha kg pear satyldy? ");
        Fruit pear = new Pear(10, 2);
        pear.Cell();
        System.out.println(pear);
    }
}