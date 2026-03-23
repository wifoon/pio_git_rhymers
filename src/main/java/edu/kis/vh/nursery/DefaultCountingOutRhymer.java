package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY_RHYMER = -1;
    public static final int IF_EMPTY = -1;
    private final int[] numbers = new int[CAPACITY];

    public int total = EMPTY_RHYMER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    public boolean callCheck() {
        return total == EMPTY_RHYMER;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }

}
