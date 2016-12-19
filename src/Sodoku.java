import java.util.*;

public class Sodoku {

	public static void main(String[] args) {
		// Puzzle puzzle = new Puzzle(new String[]{
		// 	" 1    4  ",
		// 	"3421 58 9",
		// 	"697      ",
		// 	"7   635 4",
		// 	" 36      ",
		// 	"8   216  ",
		// 	" 8  172  ",
		// 	"4 158293 ",
		// 	" 7  94  5"
		// });
		Puzzle puzzle = new Puzzle(new String[]{
			"73   5   ",
			" 4  6    ",
			"  1  9 5 ",
			" 5   1 92",
			"         ",
			"    475 8",
			"3   72   ",
			"69    2  ",
			"   63 4  "
		});
		System.out.println("Puzzle: ");
		puzzle.printPuzzle();

		System.out.println();
		puzzle.solvePuzzle();

		System.out.println();
		System.out.println("Solution: ");
		puzzle.printPuzzle();
	}
}
