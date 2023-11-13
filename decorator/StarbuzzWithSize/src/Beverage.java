public abstract class Beverage {
    public String description = "Unknown Beverage";
    private Size size = Size.TALL;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description + " " + getSize().toString();
    }

    public abstract double cost();

    public enum Size {TALL, GRANDE, VENTI}

}
