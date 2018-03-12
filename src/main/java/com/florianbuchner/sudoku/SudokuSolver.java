package com.florianbuchner.sudoku;

public final class SudokuSolver {

	public static int[][] backtrackingSearch(int[][] field) {
		return recursiveBacktrackingSearch(field, 0);
	}

	private static int[][] recursiveBacktrackingSearch(int[][] field, int pos) {
		if (pos == 9 * 9)
			return field;
		if (field[pos / 9][pos % 9] != 0)
			return recursiveBacktrackingSearch(field, pos + 1);
		for (int i = 1; i <= 9; i++) {
			if (isConsistent(field, pos, i)) {
				field[pos / 9][pos % 9] = i;
				int[][] returnvalue = recursiveBacktrackingSearch(field, pos + 1);
				if (returnvalue != null)
					return returnvalue;
				field[pos / 9][pos % 9] = 0;
			}
		}
		return null;
	}

	private static boolean isConsistent(int[][] field, int pos, int val) {
		for (int i = 0; i < 9; i++) {
			if (field[pos / 9][i] == val)
				return false;
		}
		for (int i = 0; i < 9; i++) {
			if (field[i][pos % 9] == val)
				return false;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (field[((pos / 9) / 3) * 3 + i][((pos % 9) / 3) * 3 + j] == val)
					return false;
			}
		}
		return true;
	}
}
