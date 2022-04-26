package guru.springframework;

public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    protected String currency() {
        return currency;
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) {
            throw new RuntimeException("Objects are not instances of same type.");
        }
        return ((Money) obj).amount == this.amount
            && this.getClass().equals(obj.getClass());
    }
}
