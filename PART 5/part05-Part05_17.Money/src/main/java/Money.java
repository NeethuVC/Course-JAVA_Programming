
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(euros + addition.euros, cents + addition.cents); // create a new Money object that has the correct worth
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (euros == compared.euros) {
            if (cents <= compared.cents) {
                return true;
            } else {
                return false;
            }
        } else if (euros < compared.euros) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {

        int v = euros - decreaser.euros;
        int c = 0;

        if (v < 0) {
            v = 0;
        }

        if (euros < decreaser.euros) {
            c = 0;
            v = 0;
            Money newMoney = new Money(v, c);
            return newMoney;

        } else if (euros == decreaser.euros) {
            c = cents - decreaser.cents;
            v = 0;
            Money newMoney = new Money(v, c);
            return newMoney;
        } else {

            if (cents == 0) {

                c = 100 - decreaser.cents;
                v--;
                Money newMoney = new Money(v, c);
                return newMoney;
            } else {
                c = cents - decreaser.cents;
                if (c < 0) {
                    c = c * -1;
                }
                Money newMoney = new Money(v, c);
                return newMoney;
            }
        }

//        Money newMoney = new Money(v, c);
//        return newMoney;

        // create a new Money object that has the correct worth
    }

}
