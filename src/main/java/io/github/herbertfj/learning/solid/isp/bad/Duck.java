package io.github.herbertfj.learning.solid.isp.bad;

import io.github.herbertfj.learning.solid.isp.common.Beak;
import io.github.herbertfj.learning.solid.isp.common.Feet;
import io.github.herbertfj.learning.solid.isp.common.Wings;

class Duck implements Animal {
    private final Wings wings;
    private final Beak beak;
    private final Feet feet;

    public Duck(Wings wings, Beak beak, Feet feet) {
        this.wings = wings;
        this.beak = beak;
        this.feet = feet;
    }

    @Override
    public void swim() {
        feet.flap();
    }

    @Override
    public void eat() {
        beak.chew();
    }

    @Override
    public void fly() {
        wings.flap();
    }

    @Override
    public void walk() {
        feet.step();
    }
}
