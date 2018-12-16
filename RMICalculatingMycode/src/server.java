import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class server {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter port");
		int a = s.nextInt();

		try {
			LocateRegistry.createRegistry(a);
			System.out.println("java RMI registry created.");
		} catch (RemoteException e) {
			System.out.println("Port already in use" + e);
		}
		
		try {
			Addition p1 = new Addition(); //is not interface
			System.out.println("working");
			Naming.rebind("calcul", p1);
		} catch (Exception e) {
			System.out.println("dapo Error: " + e);
		}
		
	}

}
