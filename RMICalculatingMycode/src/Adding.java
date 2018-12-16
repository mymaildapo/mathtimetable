import java.rmi.*;
//import java.rmi.RemoteException;

public interface Adding  extends Remote
{
	public int add(int a, int b) throws RemoteException;
	public int multi(int a, int b) throws RemoteException;
	public int Subtract(int a, int b) throws RemoteException;
	public int Divide(int a, int b) throws RemoteException;
	//work with constructors.
}
