package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    /*
    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
    */

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//Alt + strzałki przełączają w IntelliJ IDEA aktywny plik.