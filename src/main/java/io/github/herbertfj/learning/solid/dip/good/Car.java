package io.github.herbertfj.learning.solid.dip.good;

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
