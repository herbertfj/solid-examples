package io.github.herbertfj.learning.solid.lsp.good;

class Square implements Shape {
    private int side;

    Square(int side) {
        this.side = side;
    }

    void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
