package gfg.searching;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number for which square root is to be found");
		int n = 1;
		n = sc.nextInt();

		sc.close();

		System.err.println("Square Root by Naive method is : " + squareRootNaive(n));
	}

	static Integer squareRootNaive(int num) {
		int i = 1;
		while (i * i <= num) {
			i++;
		}
		return (i - 1);
	}

	static Integer squareRootEfficient(int num) {
		int low = 1, high = num, result = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int midSquare = mid * mid;
			if (midSquare == num)
				return mid;
			else if (midSquare > num)
				high = mid - 1;
			else {
				low = mid + 1;
				result = mid;
			}
		}
		return result;
	}
}
