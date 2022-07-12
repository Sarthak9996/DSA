package gfg.recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of disks");
		int n = 1;
		n = sc.nextInt();
		sc.close();

		System.err.println("Disk Movement is as : ");
		towerOfHanoi(n, 'A', 'B', 'C');
	}

	static void towerOfHanoi(int n, char a, char b, char c) {
		if (n == 1) {
			System.err.println("Move " + n + " from " + a + " to " + c);
			return;
		}
		towerOfHanoi(n - 1, a, c, b);
		System.err.println("Move " + n + " from " + a + " to " + c);
		towerOfHanoi(n - 1, b, a, c);
	}

}
