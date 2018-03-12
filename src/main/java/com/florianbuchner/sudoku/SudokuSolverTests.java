package com.florianbuchner.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuSolverTests {

	@Test
	public void backtrackingSearchTest() {
		final int[][] fields = {
				{2, 1, 3, 4, 5, 0, 7, 8, 9},
	            {4, 5, 8, 0, 7, 9, 2, 3, 6},
	            {6, 7, 0, 0, 0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0, 0, 0, 0, 0},
	            {1, 0, 0, 0, 0, 0, 0, 4, 0},
	            {0, 0, 2, 0, 0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0, 7, 0, 0, 0},
	            {0, 0, 7, 0, 0, 0, 1, 0, 0},};
		final int[][] solution = SudokuSolver.backtrackingSearch(fields);
		
		assertEquals(6,solution[0][5]);
		assertEquals(1,solution[1][3]);
		assertEquals(9,solution[2][2]);
	}

}
