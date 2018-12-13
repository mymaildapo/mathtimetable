package multiplication;

import java.util.Scanner;

public class multiplyNew {

	public static void main(String[] args) {
		int counter = 0;
		int a;
		int answer;
		int x;
		int enter;
		Scanner in = new Scanner(System.in);

		try {
			for (int ii = 0; ii < 12; ii++) {
				counter = 0;
				System.out.println("Program TERMINATION After===============" + (12 - ii) + " runs");

				System.out.print("No of Times table 1-n ");
				enter = in.nextInt();

				if (enter > 0) {
					System.out.print("enter The No timetable you want to do: 1-12(general time table) ");
					a = in.nextInt();
					int[] array = new int[enter];

					do {

						counter++;
						System.out.print(a + " * ");
						System.out.print(counter);
						System.out.print(" answer-: ");
						x = a * counter;
						answer = in.nextInt();
						if (x == answer) {
							System.out.println("correct");
						} else if (counter > a) {
							System.out.println(counter + "th Timetable \n============");

							for (int i = 0; i < array.length; i++) {
								array[i] = counter * (i + 1);
								System.out.println(counter + " * " + (i + 1) + " = " + array[i]);
							}
						} else {
							System.out.println("wrong here is timetable");

							for (int i = 0; i < array.length; i++) {
								array[i] = (i + 1) * a;
								System.out.println(a + " * " + (i + 1) + "= " + array[i]);

							}
						}
						int u = enter - counter;
						System.out.println("---------------------------->number of program to run left " + u);
					} while (counter != enter);
					// System.out.println("GoodBYE see you later ");
				}
			}
		} catch (Throwable e) {
			System.out.println("wrong entering");

		}
		System.out.println("GoodBYE see you later ");
	}
}
