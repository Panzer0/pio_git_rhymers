package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	private int[] numbers = new int[12];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		public boolean CallCheck() {
			return total == -1;
		}
		
			public boolean isFull() {
				return total == 11;
			}
		
				protected int peekaboo() {
					if (CallCheck())
						return -1;
					return numbers[total];
				}
			
					public int countOut() {
						if (CallCheck())
							return -1;
						return numbers[total--];
					}

}

