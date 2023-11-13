public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.20;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.25;
        }

        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
