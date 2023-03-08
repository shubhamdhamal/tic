import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TicTacToeClientImpl extends UnicastRemoteObject implements TicTacToeClient {
    private TicTacToeServer server;
    private char[][] board = new char[3][3];

    public TicTacToeClientImpl(TicTacToeServer server) throws RemoteException {
        super();
        this.server = server;
        server.registerPlayer(this);
    }

    @Override
    public void updateBoard(char[][] board) throws RemoteException {
        this.board = board;
        displayBoard();
    }

    @Override
    public void notifyWinner(char winner) throws RemoteException {
        System.out.println("Player " + winner + " wins!");
        System.exit(0);
    }

    @Override
    public void notifyTie() throws RemoteException {
        System.out.println("Tie game!");
        System.exit(0);
    }

    public void play() throws RemoteException {
        while (true) {
            if (server.makeMove(getMove(), getMove(), 'X')) {
                break;
            }
        }
    }

    private int getMove() {
        return 0;
        // TODO: Implement this method to read a move from the user
    }

    private void displayBoard() {
        // TODO: Implement this method to display the current board to the user
    }
}
