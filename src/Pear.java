public class Pear extends Fruit{
    public Pear(int amount, int price) {
        super(amount, price);
    }
    @Override
    public String toString() {
        return "Amount: "+getAmount()+
                "  Price: "+getPrice();
    }

}
