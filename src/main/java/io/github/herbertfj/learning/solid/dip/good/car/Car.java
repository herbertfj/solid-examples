package io.github.herbertfj.learning.solid.dip.good.car;

import io.github.herbertfj.learning.solid.dip.good.engine.Engine;

class Car {
    private final Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        this.engine.start();
    }

    void stop() {
        this.engine.stop();
    }

    void run() {
        this.engine.combust();
        this.engine.exhaust();
    }
}
