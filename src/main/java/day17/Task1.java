package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> chess= new ArrayList<>();
        chess.add(ChessPiece.PAWN_WHITE);
        chess.add(ChessPiece.PAWN_WHITE);
        chess.add(ChessPiece.PAWN_WHITE);
        chess.add(ChessPiece.PAWN_WHITE);
        chess.add(ChessPiece.ROOK_BLACK);
        chess.add(ChessPiece.ROOK_BLACK);
        chess.add(ChessPiece.ROOK_BLACK);
        chess.add(ChessPiece.ROOK_BLACK);

        for (ChessPiece chessPiece:chess ){
            System.out.print(chessPiece.getName()+" ");
        }


    }
}