package number_systems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arg) {

		System.out.print("Введите число в десятичной системе: ");
		int num = check();
		int num2;
		if (num == 0)
			System.out.println("Число 0 в двоичной системе: 0");
		else {
			System.out.println("Число " + num + " в двоичной системе: " + decimalToBinary(num));

		}

	}

	public static int check() {
		int num = 0;
		boolean loop = true;
		String fail = "Это должно быть целое положительное число! Повторите попытку: ";
		do {
			try {
				num = scanner.nextInt();
				if (num < 0) {
					System.out.print(fail);
				} else {
					loop = false;
				}
			} catch (InputMismatchException e) {
				System.out.print(fail);
				scanner.next();
			}
		} while (loop);
		return num;
	}

	public static String decimalToBinary(int num) {
		StringBuilder binary = new StringBuilder();

		while (num > 0) {
			int digit = num % 2;
			binary.insert(0, digit);
			num /= 2;
		}

		return binary.toString();
	}
}
