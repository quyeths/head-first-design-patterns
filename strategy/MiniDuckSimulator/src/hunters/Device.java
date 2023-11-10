package hunters;

import behaviors.QuackBehavior;

public abstract class Device {
    QuackBehavior quackBehavior;

    public Device() {
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public abstract void display();

}
