import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Addition extends UnicastRemoteObject implements Adding {
	private int a;
	private int b;

	public Addition() throws RemoteException {
		super();
	}

	public Addition(int a, int b) throws RemoteException {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int add(int a, int b) throws RemoteException {

		return a + b;
	}

	@Override
	public int multi(int a, int b) throws RemoteException {

		return a * b;
	}

	@Override
	public int Divide(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a  / b;
	}

	@Override
	public int Subtract(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a  - b;
	}
}
