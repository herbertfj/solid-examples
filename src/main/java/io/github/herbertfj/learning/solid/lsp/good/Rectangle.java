package io.github.herbertfj.learning.solid.lsp.good;

class Rectangle implements Shape {
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

    @Override
    public int getArea() {
        return length * width;
    }
}
