import java.util.List;

import chessboard.CellPosition;
import chessboard.ChessBoard;
import chessboard.Move;
import chessboard.piece.Piece;
import player.Player;

public class ChessGame {
    ChessBoard chessBoard;
    Player[] players;
    Player currentPlayer;
    List<Move> moveList;
    GameStatus gameStatus;

    public boolean playerMove(final CellPosition fromPosition, final CellPosition toPosition, final Piece piece) {
        return false;
    }

    private void changeTurn() {}
    
    public boolean endGame() {
        return false;
    }
}