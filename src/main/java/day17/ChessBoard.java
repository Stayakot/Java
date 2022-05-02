package day17;

public class ChessBoard {
    private ChessPiece[][] board;

    ChessBoard(ChessPiece[][] board) {
        this.board = board;

    }

    public ChessPiece[][] getBoard() {
        return board;
    }

    public void print(){
        for (int i=0;i< board.length;i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
