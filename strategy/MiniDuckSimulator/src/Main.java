import behaviors.FlyRocketPowered;
import behaviors.Squeak;
import ducks.Duck;
import ducks.MallardDuck;
import ducks.ModelDuck;
import hunters.Device;
import hunters.DuckCall;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        Device duckCall = new DuckCall();
        duckCall.performQuack();
        duckCall.setQuackBehavior(new Squeak());
        duckCall.performQuack();
    }
}