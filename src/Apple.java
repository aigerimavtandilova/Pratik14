public class Apple extends Fruit{
    public Apple(int amount, int price) {
        super(amount, price);
    }

    @Override
    public String toString() {
        return "Amount: "+getAmount()+
                "Price: "+getPrice();
    }
}
