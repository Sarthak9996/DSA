package gfg.recursion;

import java.util.Scanner;

public class JosephusProblem {

//	 Problem Statement : There are n persons and kth person is killed in every
//	 iteration or recursion
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of persons ");
		int n = 0;
		n = sc.nextInt();
		System.err.println("Enter the kth person to be killed");
		int k = 0;
		k = sc.nextInt();

		sc.close();

		System.err.println("Survivour in case the index is from 0 : " + josephusKilling(n, k));
		System.err.println("Survivour in case the index is from 1 : " + (josephusKilling(n, k) + 1));
	}

	static Integer josephusKilling(int n, int k) {
		if (n == 1)
			return 0;
		return (josephusKilling(n - 1, k) + k) % n;
	}

}
