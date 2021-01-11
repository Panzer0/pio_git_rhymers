package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!CallCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.CallCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}
