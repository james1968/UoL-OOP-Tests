import org.junit.Test;

import static org.junit.Assert.*;

public class ChessTest {

    @Test

    public void canAttackKing() throws Exception {
        Chess.ChessPiece a = new Chess.King( 1, 1 );
        Chess.ChessPiece b = new Chess.Queen( 2, 2 );
        Chess.ChessPiece e = new Chess.Queen( 4, 4 );
        assertEquals(a.canAttack(b),true);
        assertEquals(a.canAttack(e), false);
    }

    @Test

    public void canAttackBishop() throws Exception {
        Chess.ChessPiece f = new Chess.Bishop( 3, 4);
        Chess.ChessPiece g = new Chess.Queen(5, 6);
        Chess.ChessPiece h = new Chess.Queen(3, 5);
        assertEquals(f.canAttack(g),true);
        assertEquals(f.canAttack(h), false);
    }

    @Test
    public void canAttackRook() throws Exception {
        Chess.ChessPiece e = new Chess.Rook( 2, 2 );
        Chess.ChessPiece f = new Chess.Knight( 2, 5 );
        Chess.ChessPiece g = new Chess.Rook( 7, 2 );
        Chess.ChessPiece h = new Chess.Rook( 7, 7 );
        assertEquals(e.canAttack(f), true);
        assertEquals(e.canAttack(g), true);
        assertEquals(e.canAttack(h), false);

    }



}
