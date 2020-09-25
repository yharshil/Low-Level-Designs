package chessboard.piece;

import java.util.List;

import chessboard.CellPosition;
import player.Color;

public interface Piece {
    public static Color color = null;
    
    public boolean move(final CellPosition frompPosition, final CellPosition toPosition);

    public List<CellPosition> possibleMove(final CellPosition fromPosition);

    public boolean validate(final CellPosition fromPosition, final CellPosition Position);
}
