package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.OccupiedCellException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class BishopBlackTest extends TestCase {

    @Test
    public void testBishopWayLeftDown() {
        BishopBlack black = new BishopBlack(Cell.E5);
        assertThat(black.way(Cell.A1), is(new Cell[]{Cell.D4, Cell.C3, Cell.B2, Cell.A1}));
    }

    @Test
    public void testBishopWayLeftUp() {
        BishopBlack black = new BishopBlack(Cell.E5);
        assertThat(black.way(Cell.H8), is(new Cell[]{Cell.F6, Cell.G7, Cell.H8}));
    }

    @Test
    public void testBishopWayRightUp() {
        BishopBlack black = new BishopBlack(Cell.E5);
        assertThat(black.way(Cell.B8), is(new Cell[]{Cell.D6, Cell.C7, Cell.B8}));
    }

    @Test
    public void testBishopWayRightDown() {
        BishopBlack black = new BishopBlack(Cell.E5);
        assertThat(black.way(Cell.H2), is(new Cell[]{Cell.F4, Cell.G3, Cell.H2}));
    }

    @Test
    public void testPosition() {
        BishopBlack black = new BishopBlack(Cell.E5);
        assertThat(black.position(), is(Cell.E5));

    }

    @Test
    public void testCopy() {
        BishopBlack black = new BishopBlack(Cell.E5);
        Figure dest = black.copy(Cell.H8);
        assertThat(dest.position(), is(Cell.H8));
    }
}