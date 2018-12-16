import java.util.Scanner;

public class ClientImp {
	private int x;
	private int y;

	public void printChoice() {
		System.out.println("1. for add /n 2. for mulitply /n 3 for divide /n 4. Subtract");
	}

	public void printXY() {
		Scanner s = new Scanner(System.in);
		System.out.println("print x");
		x = s.nextInt();
		System.out.println("print y");
		y = s.nextInt();

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
