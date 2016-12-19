import java.awt.PageAttributes.PrintQualityType;
import java.util.ArrayList;

public class Sodoku {

	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle();
		// puzzleOne(puzzle);
		puzzleTwo(puzzle);
		System.out.println("Puzzle: ");
		puzzle.printPuzzle();

		System.out.println();
		puzzle.solvePuzzle();
		System.out.println("Solution: ");
		puzzle.printPuzzle();

	}

	public static void puzzleOne(Puzzle puzzle) {

		// box 1
		puzzle.setValue(0, 0, 7);
		puzzle.setValue(0, 1, 3);
		puzzle.setValue(1, 1, 4);
		puzzle.setValue(2, 2, 1);

		// box 2
		puzzle.setValue(0, 5, 5);
		puzzle.setValue(1, 4, 6);
		puzzle.setValue(2, 5, 9);

		// box 3
		puzzle.setValue(2, 7, 5);

		// box 4
		puzzle.setValue(3, 1, 5);

		// box 5
		puzzle.setValue(3, 5, 1);
		puzzle.setValue(5, 4, 4);
		puzzle.setValue(5, 5, 7);

		// box 6
		puzzle.setValue(3, 7, 9);
		puzzle.setValue(3, 8, 2);
		puzzle.setValue(5, 6, 5);
		puzzle.setValue(5, 8, 8);

		// box 7
		puzzle.setValue(6, 0, 3);
		puzzle.setValue(7, 0, 6);
		puzzle.setValue(7, 1, 9);

		// box 8
		puzzle.setValue(6, 4, 7);
		puzzle.setValue(6, 5, 2);
		puzzle.setValue(8, 3, 6);
		puzzle.setValue(8, 4, 3);

		// box 9
		puzzle.setValue(7, 6, 2);
		puzzle.setValue(8, 6, 4);

	}

	public static void puzzleTwo(Puzzle puzzle) {

		// box 1
		puzzle.setValue(0, 1, 1);
		puzzle.setValue(1, 0, 3);
		puzzle.setValue(1, 1, 4);
		puzzle.setValue(1, 2, 2);
		puzzle.setValue(2, 0, 6);
		puzzle.setValue(2, 1, 9);
		puzzle.setValue(2, 2, 7);

		// box 2
		puzzle.setValue(1, 3, 1);
		puzzle.setValue(1, 5, 5);

		// box 3
		puzzle.setValue(0, 6, 4);
		puzzle.setValue(1, 6, 8);
		puzzle.setValue(1, 8, 9);

		// box 4
		puzzle.setValue(3, 0, 7);
		puzzle.setValue(4, 1, 3);
		puzzle.setValue(4, 2, 6);
		puzzle.setValue(5, 0, 8);

		// box 5
		puzzle.setValue(3, 4, 6);
		puzzle.setValue(3, 5, 3);
		puzzle.setValue(5, 4, 2);
		puzzle.setValue(5, 5, 1);

		// box 6
		puzzle.setValue(3, 6, 5);
		puzzle.setValue(3, 8, 4);
		puzzle.setValue(5, 6, 6);

		// box 7
		puzzle.setValue(6, 1, 8);
		puzzle.setValue(7, 0, 4);
		puzzle.setValue(7, 2, 1);
		puzzle.setValue(8, 1, 7);

		// box 8
		puzzle.setValue(6, 4, 1);
		puzzle.setValue(6, 5, 7);
		puzzle.setValue(7, 3, 5);
		puzzle.setValue(7, 4, 8);
		puzzle.setValue(7, 5, 2);
		puzzle.setValue(8, 4, 9);
		puzzle.setValue(8, 5, 4);

		// box 9
		puzzle.setValue(6, 6, 2);
		puzzle.setValue(7, 6, 9);
		puzzle.setValue(7, 7, 3);
		puzzle.setValue(8, 8, 5);

	}
}
