import java.rmi.Naming;
import java.util.Scanner;

public class Client {
	

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ClientImp c = new ClientImp();
		c.printChoice();

		try {
			int choice = in.nextInt();

			String url = "rmi:///";
			Adding p = (Adding) Naming.lookup(url + "calcul");// client use interface class name
			switch (choice) {

			case (1):
				c.printXY();
				int d1 = p.add(c.getX(), c.getY());
				System.out.println("Result: " + d1);
				System.in.read();
				break;

			case (2):
				c.printXY();
				int d2 = p.multi(c.getX(), c.getY());
				System.out.println("Result: " + d2);
				System.in.read();
				break;
			case (3):
				c.printXY();
				int d3 = p.Divide(c.getX(), c.getY());
				System.out.println("Result: " + d3);
				System.in.read();
				break;
			case (4):
				c.printXY();
				int d4 = p.Subtract(c.getX(), c.getY());
				System.out.println("Result: " + d4);
				System.in.read();
				break;
			default:
				System.out.println("nothing");
			}

		} catch (Exception e) {
			System.err.println("Error " + e);
		}

	}
}
