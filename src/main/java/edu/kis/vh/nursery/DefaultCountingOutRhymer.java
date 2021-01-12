package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int variable = -1;
	private int[] numbers = new int[12];

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
			return total == -1;
		}
		
			public boolean isFull() {
				return total == 11;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return -1;
					return numbers[total];
				}
			
					public int countOut() {
						if (callCheck())
							return variable;
						return numbers[total--];
					}

}

