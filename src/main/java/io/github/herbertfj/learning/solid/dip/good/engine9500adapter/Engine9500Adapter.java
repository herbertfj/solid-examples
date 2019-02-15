package io.github.herbertfj.learning.solid.dip.good.engine9500adapter;

import io.github.herbertfj.learning.solid.dip.client.engine9500.Engine9500;
import io.github.herbertfj.learning.solid.dip.good.engine.Engine;

public class Engine9500Adapter implements Engine {
    private final Engine9500 engine9500;

    public Engine9500Adapter(Engine9500 engine9500) {
        this.engine9500 = engine9500;
    }

    @Override
    public void start() {
        this.engine9500.set(11, true);
    }

    @Override
    public void stop() {
        this.engine9500.set(11, false);
    }

    @Override
    public void combust() {
        this.engine9500.set(2, true);
        this.engine9500.set(3, true);
    }

    @Override
    public void exhaust() {
    }
}
