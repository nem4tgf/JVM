package Lab6;

public class PlayerIncome extends Player implements Tax {
    public PlayerIncome(String name) {
        super(name);
    }

    @Override
    public String displayDetails() {
        return null;
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
