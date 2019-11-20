package fr.leroideskiwis.fairytail.utils;

public class Interval {

    private int min;
    private int max;

    public Interval(int min, int max){
        this.min = min;
        this.max = max;
    }

    /**
     * vérifie que number est entre min et max
     *
     * @param number le nombre à comparer avec min et max
     * @return true si number est entre min (inclus) et max (exclus)
     */

    public boolean isBetween(int number){
        return number >= min && number < max;
    }

}
