package Nitro;

import java.util.*;

public class TowerHanoi {

	public static int HanoiTower(int disks) { 
		if (disks == 1) {
			return 2;
		} else {
			return 2 * HanoiTower(disks - 1);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int value = scan.nextInt();

		int test = 1;

		while (value != 0) {

			int resultFunction = HanoiTower(value);

			System.out.println("Teste " + test);
			System.out.print(resultFunction - 1);
			System.out.println("\n");

			value = scan.nextInt();
			test++;
		}
	}
}
