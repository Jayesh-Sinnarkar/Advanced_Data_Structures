package testers;

import java.util.Scanner;

import com.utils.QueueUsingArrays;

public class CircularQueueTester {

	public static void main(String[] args) {
		boolean exit = false;
		QueueUsingArrays q = new QueueUsingArrays(5);
		try (Scanner sc = new Scanner(System.in)) {

			while (!exit) {

				try {
					System.out.println("-------MENU-------" + "\n1. Push Element" + "\n2. Pop Element"
							+ "\n3. Display Queue" + "\n0. Exit");
					System.out.print("\nEnter your choice: ");
					int ch = sc.nextInt();

					switch (ch) {

					case 1:
						System.out.println("1. Push Element: \n");
						System.out.print("Enter number: ");
						q.push(sc.nextInt());
						break;

					case 2:
						System.out.println("2. Pop Element: \n");
						int val= q.peek();
						q.pop();
						System.out.println(val+" is poped");
						break;

					case 3:
						q.display();
						break;

					case 4:
						exit = true;
						System.out.println("Thnak you...");
						break;

					default:
						System.out.println("Invalid choice kindly enter valid number.");
						break;
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
