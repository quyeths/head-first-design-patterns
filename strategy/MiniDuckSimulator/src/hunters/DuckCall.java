package hunters;

import behaviors.Quack;

public class DuckCall extends Device{
    public DuckCall() {
        setQuackBehavior(new Quack());
    }
    @Override
    public void display() {
        System.out.println("I'm a real DuckCall");
    }

}
