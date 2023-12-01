package org.example.享元模式;

class BlackPiece extends Piece {
    public BlackPiece(PieceColor color, PiecePos pos) {
        super(color, pos);
    }

    @Override
    public void draw() {
        System.out.println("draw a blackpiece");
    }
}
