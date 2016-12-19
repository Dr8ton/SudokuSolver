import java.util.*;

public class Puzzle {
	private Box[][] puzzle;

	public Puzzle(String[] nums) {
		this.puzzle = new Box[9][9];

		for (int i = 0; i < puzzle.length; i++) {
			for (int j = 0; j < puzzle[i].length; j++) {
				if (Character.isDigit(nums[i].charAt(j))) {
					puzzle[i][j] = new Box(Character.getNumericValue(nums[i].charAt(j)));
				} else {
					puzzle[i][j] = new Box();
				}
			}
		}
	}

	private void printChoices() {
		for (int i = 0; i < puzzle.length; i++) {
			for (int j = 0; j < puzzle[i].length; j++) {
				if (!this.puzzle[i][j].isSolved()) {
					System.out.println("Choices left " + this.puzzle[i][j].numChoices());
				}
			}
		}
	}

	private void removeKnownValues() {
		for (int i = 0; i < puzzle.length; i++) {
			for (int j = 0; j < puzzle[i].length; j++) {
				if (this.puzzle[i][j].isSolved()) {
					removeKnownValue(i, j, this.puzzle[i][j].getValue());
				}
			}
		}
		removeKnownValuesForSquare(0, 0);
		removeKnownValuesForSquare(0, 3);
		removeKnownValuesForSquare(0, 6);
		removeKnownValuesForSquare(3, 0);
		removeKnownValuesForSquare(3, 3);
		removeKnownValuesForSquare(3, 6);
		removeKnownValuesForSquare(6, 0);
		removeKnownValuesForSquare(6, 3);
		removeKnownValuesForSquare(6, 6);

		printChoices();
	}

	private void removeKnownValue(int row, int col, int value) {
		for (int n = 0; n < puzzle.length; n++) {
			this.puzzle[row][n].notPossible(value);
			this.puzzle[n][col].notPossible(value);
		}
	}

	private void removeKnownValuesForSquare(int row, int col) {
		Set<Integer> acc = new HashSet<Integer>();
		for (int r = row; r < row + 3; r++) {
			for (int c = col; c < col + 3; c++) {
				if (this.puzzle[r][c].isSolved()) {
					acc.add(this.puzzle[r][c].getValue());
				}
			}
		}
		for (int r = row; r < row + 3; r++) {
			for (int c = col; c < col + 3; c++) {
				if (!this.puzzle[r][c].isSolved()) {
					for (Integer i : acc) {
						this.puzzle[r][c].notPossible(i);
					}
				}
			}
		}
	}

	public void printPuzzle() {
		for (int i = 0; i < puzzle.length; i++) {
			for (int j = 0; j < puzzle[i].length; j++) {
				int val = this.puzzle[i][j].getValue();
				if (val == 0) {
					System.out.print(" ");
				} else {
					System.out.print(val);
				}
			}
			System.out.println();
		}
	}

	public void solvePuzzle() {
		removeKnownValues();
		removeKnownValues();
		removeKnownValues();
		removeKnownValues();
	}
}
