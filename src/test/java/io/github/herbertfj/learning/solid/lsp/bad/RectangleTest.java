package io.github.herbertfj.learning.solid.lsp.bad;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleTest {

    @Test
    void rectangleTest() {
        Rectangle rectangle = new Rectangle(20, 20);

        rectangle.setWidth(5);

        assertThat(rectangle.getArea()).isEqualTo(100);
    }

    @Test
    void squareTest() {
        Rectangle rectangle = new Square(20);

        rectangle.setWidth(5);

        assertThat(rectangle.getArea()).isEqualTo(100);
    }

}