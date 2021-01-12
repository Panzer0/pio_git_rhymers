package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	private final int EMPTY_RHYMER_INDICATOR=-1;
	private final int DEFAULT_VALUE=-1;
	private final int MAX_SIZE=11;
	private static final int variable = -1;
	private final int[] numbers = new int[MAX_SIZE];

	private int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}


	public boolean callCheck() {
			return total == EMPTY_RHYMER_INDICATOR;
		}
		
			public boolean isFull() {
				return MAX_SIZE == 11;
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

