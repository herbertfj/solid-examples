package io.github.herbertfj.learning.solid.lsp.bad;

class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }

    @Override
    void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    void setWidth(int width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
