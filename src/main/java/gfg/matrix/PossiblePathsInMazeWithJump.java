package gfg.matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class PossiblePathsInMazeWithJump {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number of rows");
		int n = sc.nextInt();
		System.err.println("Enter the number of columns");
		int m = sc.nextInt();
		ArrayList<String> ans = getMazePaths(0, 0, n - 1, m - 1);
		System.out.println(ans);
	}

	// sr - source row
	// sc - source column
	// dr - destination row
	// dc - destination column
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if (sr == dr && sc == dc) {
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
		} else if (sr > dr || sc > dc) {
			ArrayList<String> bres = new ArrayList<String>();
			return bres;
		}

//		horizontal
		ArrayList<String> paths = new ArrayList<String>();
		for (int i = 1; i <= dc - sc; i++) {
			ArrayList<String> hpaths = getMazePaths(sr, sc + i, dr, dc);
			for (String hpath : hpaths) {
				paths.add("h" + i + hpath);
			}

		}

//		vertical
		for (int i = 1; i <= dr - sr; i++) {
			ArrayList<String> vpaths = getMazePaths(sr + i, sc, dr, dc);
			for (String vpath : vpaths) {
				paths.add("v" + i + vpath);
			}
		}

//		diagonal
		for (int i = 1; i <= Math.min(dc - sc, dr - sr); i++) {
			ArrayList<String> dpaths = getMazePaths(sr + i, sc + i, dr, dc);
			for (String dpath : dpaths) {
				paths.add("d" + i + dpath);
			}
		}
		return paths;
	}
}
