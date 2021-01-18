package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	private final int EMPTY_RHYMER_INDICATOR=-1;
	private final int DEFAULT_VALUE=-1;
	private final int MAX_SIZE=12;
	private static final int variable = -1;
	private int[] numbers = new int[MAX_SIZE];

	public int getTotal() {
		return total;
	}

	private int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public boolean callCheck() {
			return total == EMPTY_RHYMER_INDICATOR;
		}

	public boolean isFull() {
		return total==(MAX_SIZE-1) ;
	}
		

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_VALUE;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return variable;
		return numbers[total--];
	}

}

