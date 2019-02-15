package io.github.herbertfj.learning.solid.dip.good.engine9000adapter;

import io.github.herbertfj.learning.solid.dip.client.engine9000.Engine9000;
import io.github.herbertfj.learning.solid.dip.good.engine.Engine;

public class Engine9000Adapter implements Engine {
    private final Engine9000 engine9000;

    public Engine9000Adapter(Engine9000 engine9000) {
        this.engine9000 = engine9000;
    }

    @Override
    public void start() {
        this.engine9000.set(3, true);
    }

    @Override
    public void stop() {
        this.engine9000.set(3, false);
    }

    @Override
    public void combust() {
        this.engine9000.set(2, true);
    }

    @Override
    public void exhaust() {
        this.engine9000.set(2, false);
    }
}
