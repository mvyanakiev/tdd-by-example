package guru.springframework;

public abstract class Money {

    protected int amount;

    public abstract Money times(int multiplier);

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) {
            throw new RuntimeException("Objects are not instances of same type.");
        }
        return ((Money) obj).amount == this.amount
                && this.getClass().equals(obj.getClass());
    }
}
