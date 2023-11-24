package isp1;

import java.util.ArrayList;
import java.util.Collection;

public class Prog {
    public static void main(String[] args) {
        var bird = new Bird();
        var bird1 = new Bird();
        var bird2 = new Duck();
        var bird3 = new Duck();
        var bird4 = new Penguin();

        Collection<Bird> birds = new ArrayList<>();
        birds.add(bird);
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);
        birds.add(bird4);

        processFly(birds);

    }

    public static void processFly(Collection<Bird> birds) {
        for (Bird bird : birds) {
            if (bird.isCanFly())
                bird.fly();
        }
    }
}
