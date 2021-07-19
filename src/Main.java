import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Operations op = new Operations();

		System.out.println("Welcome to LockedMe.Com developed by Manisha Chaudhari");
		System.out.println(" ");

		op.listFile();
		while (true) {
			System.out.println(" ");
			System.out.println("press Y to continue to operations, press N to exit");
			String ask = scanner.nextLine();

			if (ask.equals("Y")) {
				System.out.println("Enter C: create the file");
				System.out.println("Enter R: read the file");
				System.out.println("Enter D: delete the file");
				System.out.println("Enter L: list of files ");
				System.out.println("Enter E: to exit");
			} else if (ask.equals("N")) {
				break;
			}

			String command = scanner.nextLine();

			if (command.equals("C")) {
				op.createFile();
			} else if (command.equals("R")) {
				try {
					op.readFile();
				} catch (FileNotFoundException e) {
					System.out.println("File doesn't exists");
				}
			} else if (command.equals("D")) {
				op.deleteFile();
			} else if (command.equals("L")) {
				op.listFile();
			} else if (command.equals("E")) {
				break;
			}
		}

	}
}
