public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        double cost = 0;
        if (getSize() == Size.TALL) {
            cost = 0.89;
        } else if (getSize() == Size.GRANDE) {
            cost = 0.94;
        } else if (getSize() == Size.VENTI) {
            cost = 0.99;
        }
        return cost;
    }
}
