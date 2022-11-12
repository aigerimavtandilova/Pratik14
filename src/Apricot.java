public class Apricot extends Fruit{
    public Apricot(int amount, int price) {
        super(amount, price);
    }
    @Override
    public String toString() {
        return "Amount: "+getAmount()+
                "  Price: "+getPrice();
    }

}
