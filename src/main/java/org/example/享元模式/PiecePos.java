package org.example.享元模式;

/**
 * @author lst
 * @date 2023年12月01日 15:47
 */

class PiecePos { // 棋子位置
    private int x;
    private int y;

    public PiecePos(int a, int b) {
        x = a;
        y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
