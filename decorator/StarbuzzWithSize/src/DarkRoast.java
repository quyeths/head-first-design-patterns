public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    @Override
    public double cost() {
        double cost = 0;
        if (getSize() == Size.TALL) {
            cost = 0.99;
        } else if (getSize() == Size.GRANDE) {
            cost = 1.04;
        } else if (getSize() == Size.VENTI) {
            cost = 1.09;
        }
        return cost;
    }
}
