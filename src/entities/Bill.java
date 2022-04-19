package entities;


public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;


    public double cover() {
        if (feeding() <= 30.0) {
            return 4.0;
        } else {
            return 0.0;
        }
    }

    public double feeding() {
        return(beer * 5.0) + (softDrink * 3.0) + (barbecue * 7.0);
    }

    public double ticket() {
        return switch (gender) {
            case 'M' -> 10.0;
            case 'F' -> 8.0;
            default -> throw new IllegalStateException("Unexpected value: " + gender);
        };
    }

    public double total() {
        return ticket() + feeding() + cover();
    }
}