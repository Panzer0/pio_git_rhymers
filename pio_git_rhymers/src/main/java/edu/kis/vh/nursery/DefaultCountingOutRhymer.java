package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private int[] numbers = new int[12];

	public int getTotal() {
		return total;
	}

	/*
	public void setTotal(int total) {
		this.total = total;
	}
	 */
	private int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	private int[] getNumbers() {
		return numbers;
	}

	/*
	private void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	 */

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
							return -1;
						return numbers[total--];
					}

}
