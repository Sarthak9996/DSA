package gfg.matrix;

public class Array_2D {
	public static void main(String[] args) {
		Integer[][] ar = new Integer[2][3];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.err.println("[" + i + "," + j + "] : " + ar[i][j]);
			}
		}
	}
}
