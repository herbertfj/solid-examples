package io.github.herbertfj.learning.solid.isp.good;

import io.github.herbertfj.learning.solid.isp.common.Mouth;
import io.github.herbertfj.learning.solid.isp.common.Tail;

public class Fish implements CanSwim, CanEat {
    private final Tail tail;
    private final Mouth mouth;

    public Fish(Tail tail, Mouth mouth) {
        this.tail = tail;
        this.mouth = mouth;
    }

    @Override
    public void swim() {
        tail.shake();
    }

    @Override
    public void eat() {
        mouth.chew();
    }

}
