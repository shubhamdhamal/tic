import java.io.Serializable;

public class TicTacToeMove implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int row;
    private int column;
    private char player;

    public TicTacToeMove(int row, int column, char player) {
        this.row = row;
        this.column = column;
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getPlayer() {
        return player;
    }
}
