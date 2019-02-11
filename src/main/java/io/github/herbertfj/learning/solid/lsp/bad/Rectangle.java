package io.github.herbertfj.learning.solid.lsp.bad;

class Rectangle {
    private int length;
    private int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void setLength(int length) {
        this.length = length;
    }

    void setWidth(int width) {
        this.width = width;
    }

    int getArea() {
        return length * width;
    }
}
