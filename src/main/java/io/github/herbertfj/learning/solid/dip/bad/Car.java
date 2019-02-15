package io.github.herbertfj.learning.solid.dip.bad;

import io.github.herbertfj.learning.solid.dip.client.engine9000.Engine9000;

class Car {
    private final Engine9000 engine;

    Car(Engine9000 engine) {
        this.engine = engine;
    }

    void start() {
        this.engine.set(3, true);
    }

    void stop() {
        this.engine.set(3, false);
    }

    void run() {
        this.engine.set(2, true);
        this.engine.set(2, false);
    }
}
