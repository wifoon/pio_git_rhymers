package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer uniemożliwia ona dodanie liczby większej niż ta,
 * która aktualnie znajduje się na szczycie wyliczanki.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int REJECTED = 0;
    /**
     * Licznik odrzuconych elementów.
     */
    private int totalRejected = REJECTED;

    /**
     * Zwraca całkowitą liczbę odrzuconych elementów.
     * @return liczba odrzuconych elementów.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje nową wartość do wyliczanki. Jeżeli nowa wartość jest większa
     * od aktualnej wartości szczytowej, operacja jest przerywana,
     * a licznik odrzuceń zostaje zwiększony.
     * @param in wartość całkowita, która ma zostać dodana.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     * Getter dla pola totalRejected.
     * @return aktualna wartość licznika odrzuceń.
     */
    public int getTotalRejected() {
        return totalRejected;
    }
}
