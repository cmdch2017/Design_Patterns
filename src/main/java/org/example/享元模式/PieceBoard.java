package org.example.享元模式;

import java.util.ArrayList;

class PieceBoard { // 棋盘上已有的棋子
    private static final ArrayList<Piece> m_arrayPiece = new ArrayList();
    private String m_blackName; // 黑方名称
    private String m_whiteName; // 白方名称

    public PieceBoard(String black, String white) {
        m_blackName = black;
        m_whiteName = white;
    }

    // 一步棋，在棋盘上放一颗棋子
    public void SetPiece(PieceColor color, PiecePos pos) {
        Piece piece = null;
        if (color == PieceColor.BLACK) { // 放黑子
            piece = new BlackPiece(color, pos); // 获取一颗黑子
            System.out.println(m_blackName + "在位置(" + pos.getX() + ","
                    + pos.getY() + ")");
            piece.draw();
        } else { // 放白子
            piece = new WhitePiece(color, pos); // 获取一颗白子
            System.out.println(m_whiteName + "在位置(" + pos.getX() + ","
                    + pos.getY() + ")");
            piece.draw();
        }
        m_arrayPiece.add(piece);
    }
}
