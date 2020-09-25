package chessboard;

import chessboard.piece.Piece;
import player.Player;

public class Move {
    Player player;
    Piece piece;
    Piece killedPiece;
    CellPosition fromPosition;
    CellPosition toPosition;
}
