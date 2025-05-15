public class Cash extends Asset {
    private double amount;

    public Cash(String name, double amount) {
        super(name);
        this.amount = amount;
    }

    @Override
    public double getValue() {
        return amount;
    }
}
