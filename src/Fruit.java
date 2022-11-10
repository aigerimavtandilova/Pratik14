import java.util.Scanner;

public class Fruit {
    private int amount, price;

    public Fruit(int amount, int price) {
        this.amount = amount;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }
    Scanner scanner=new Scanner(System.in);
    int amount1= scanner.nextInt();
    public void  Cell(){
        System.out.println(amount1* getPrice()+" somgo satyldy");
        System.out.println((amount-amount1)+" kg kaldy.");
    }

}
