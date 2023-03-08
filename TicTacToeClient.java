import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TicTacToeClient extends Remote {
    public void updateBoard(char[][] board) throws RemoteException;
    public void notifyWinner(char winner) throws RemoteException;
    public void notifyTie() throws RemoteException;
}
