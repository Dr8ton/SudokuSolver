import java.util.*;

public class Box {

	private Set<Integer> possible = new HashSet<Integer>();

	public Box() {
		for (int i = 1; i < 10; i++) {
			this.possible.add(i);
		}
	}

	public Box(int value) {
		this.possible.add(value);
	}

	public int getValue() {
		return this.possible.size() == 1 ? this.possible.iterator().next() : 0;
	}

	public int numChoices() {
		return this.possible.size();
	}

	@Override
	public String toString() {
		return this.possible.toString();
	}

	public void notPossible(int value) {
		if (!isSolved()) {
			this.possible.remove(value);
			if (isSolved()) {
				System.out.println("Solved for value " + getValue());
			}
		}
	}

	public Set<Integer> getPossible() {
		return possible;
	}

	public boolean isSolved() {
		return this.possible.size() == 1;
	}

}
