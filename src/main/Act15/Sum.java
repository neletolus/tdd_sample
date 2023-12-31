package main.Act15;

public class Sum implements Expression {
    public Expression augend;
    public Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank,to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }
}
