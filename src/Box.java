import java.util.ArrayList;

public class Box {
	private ArrayList<Integer> possible = new ArrayList<Integer>();
	private boolean solved;
	private int value;
	private int group;

	public Box() {
		for (int i = 1; i < 10; i++) {
			this.possible.add(i);
		}
		this.solved = false;
		this.value = 0;

	}

	public Box(int value) {
		this.value = value;
		this.solved = true;
		this.possible.add(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		this.solved=true; 
		this.possible.clear();
	}

	@Override
	public String toString() {
		return this.possible.toString();
	}

	public void notPossible(Integer value) {
		this.possible.remove(value);
		if (this.possible.size() == 1) {
			this.value = this.possible.get(0);
		}
		this.solved = true;
	}

	public ArrayList<Integer> getPossible() {
		return possible;
	}

	public boolean isSolved() {
		return solved;
	}

	public void setSolved(boolean solved) {
		this.solved = solved;
		this.possible.clear();
	}

}
