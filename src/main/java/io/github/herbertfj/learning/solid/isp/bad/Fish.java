package io.github.herbertfj.learning.solid.isp.bad;

import io.github.herbertfj.learning.solid.isp.common.InvalidOperationException;
import io.github.herbertfj.learning.solid.isp.common.Mouth;
import io.github.herbertfj.learning.solid.isp.common.Tail;

public class Fish implements Animal {
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

    @Override
    public void fly() {
        throw new InvalidOperationException();
    }

    @Override
    public void walk() {
        throw new InvalidOperationException();
    }
}
