import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TicTacToeServer extends Remote {
    public boolean registerPlayer(TicTacToeClient client) throws RemoteException;
    public boolean makeMove(int x, int y, char player) throws RemoteException;
}
