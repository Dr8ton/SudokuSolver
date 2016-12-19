
public class Puzzle {
	private Box[][] puzzle;

	public Puzzle() {
		this.puzzle = buildPuzzle();
	}

	public Box[][] buildPuzzle() {
		Box[][] puzzle = new Box[9][9];
		for (int i = 0; i < puzzle.length; i++) {
			for (int j = 0; j < puzzle[i].length; j++) {
				Box box = new Box();
				puzzle[i][j] = box;
			}
		}
		return puzzle;
	}

	public void setValue(int row, int col, int value) {
		this.puzzle[row][col].setValue(value);
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
		boolean done =false; 
		int count = 0;
		while (!done) {
			count++; 
			System.out.println("iteration " + count);
			done=true; 
			for (int i = 0; i < puzzle.length; i++) {
				for (int j = 0; j < puzzle[i].length; j++) {
					Box box = this.puzzle[i][j];
					if (!box.isSolved()) {
						System.out.println("box" + i + j + "is not finished");
						done=false; 
						checkRow(i, box.getValue());
						checkCol(j, box.getValue());
						
					}
				}
			}
		}
		System.out.println();
	}

	public void checkRow(int row, int val) {
		for (int j = 0; j < 9; j++) {
			Box box = this.puzzle[row][j];
			if (box.isSolved()) {
				box.notPossible(val);
			}
		}
	}

	public void checkCol(int col, int val) {
		for (int j = 0; j < 9; j++) {
			Box box = this.puzzle[j][col];
			if (box.isSolved()) {
				box.notPossible(val);
			}
		}
	}

}