package org.example.享元模式;

class WhitePiece extends Piece {
    public WhitePiece(PieceColor color, PiecePos pos) {
        super(color, pos);
    }

    public void draw() {
        System.out.println("white a blackpiece");
    }
}
