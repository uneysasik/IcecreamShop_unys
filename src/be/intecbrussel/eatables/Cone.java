package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {

    private Flavor[] balls = new Flavor[0];

    public Cone() {

    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println(Arrays.toString(balls) + "flavored cone(s) selected");
    }
    public enum Flavor {

        STRAWBERRY(),
        BANANA(),
        CHOCOLATE(),
        VANILLA(),
        LEMON(),
        STRACIATELLA(),
        MOKKA(),
        PISTACHE();

    }
}
