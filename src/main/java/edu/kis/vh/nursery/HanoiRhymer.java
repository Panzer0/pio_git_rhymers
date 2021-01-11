package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!CallCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//Alt + strzałki przełączają w IntelliJ IDEA aktywny plik.