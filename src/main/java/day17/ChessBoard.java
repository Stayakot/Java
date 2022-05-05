package day17;

import java.util.Optional;

public class ChessBoard {
//    private ChessPiece[][] board;
//
//    ChessBoard(ChessPiece[][] board) {
//        this.board = board;
//
//    }
//
//    public ChessPiece[][] getBoard() {
//        return board;
//    }

    public void print(ChessPiece[][] chessPiece) {
        for (int i = 0; i < chessPiece.length; i++) {
            for (int j = 0; j < chessPiece[i].length; j++) {
                chessPiece[i][j] = ChessPiece.EMPTY;

            }
        }
        chessPiece[0][0]=ChessPiece.ROOK_BLACK;
        chessPiece[0][5]=ChessPiece.ROOK_BLACK;
        chessPiece[0][6]=ChessPiece.KING_BLACK;

        chessPiece[1][1]=ChessPiece.ROOK_WHITE;
        chessPiece[1][4]=ChessPiece.PAWN_BLACK;
        chessPiece[1][5]=ChessPiece.PAWN_BLACK;
        chessPiece[1][7]=ChessPiece.PAWN_BLACK;

        chessPiece[2][0]=ChessPiece.PAWN_BLACK;
        chessPiece[2][2]=ChessPiece.KNIGHT_BLACK;
        chessPiece[2][6]=ChessPiece.PAWN_BLACK;

        chessPiece[3][0]=ChessPiece.QUEEN_BLACK;
        chessPiece[3][3]=ChessPiece.BISHOP_WHITE;

        chessPiece[4][3]=ChessPiece.BISHOP_BLACK;
        chessPiece[4][4]=ChessPiece.PAWN_WHITE;

        chessPiece[5][4]=ChessPiece.BISHOP_WHITE;
        chessPiece[5][5]=ChessPiece.PAWN_WHITE;

        chessPiece[6][0]=ChessPiece.PAWN_WHITE;
        chessPiece[6][3]=ChessPiece.QUEEN_WHITE;
        chessPiece[6][5]=ChessPiece.PAWN_WHITE;
        chessPiece[6][7]=ChessPiece.PAWN_WHITE;

        chessPiece[7][5]=ChessPiece.ROOK_WHITE;
        chessPiece[7][6]=ChessPiece.KING_WHITE;

        for (ChessPiece[]chessPieces:chessPiece){
            for (ChessPiece piece:chessPieces){
                System.out.print(piece);
            }System.out.println();
        }
    }
}

