package org.example.享元模式;

abstract class Piece { // 棋子定义
    protected PieceColor m_color; // 颜色
    protected PiecePos m_pos; // 位置

    public Piece(PieceColor color, PiecePos pos) {
        m_color = color;
        m_pos = pos;
    }
   abstract public  void draw();
}
