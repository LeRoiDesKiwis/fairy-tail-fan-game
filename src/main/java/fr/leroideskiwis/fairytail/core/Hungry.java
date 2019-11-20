package fr.leroideskiwis.fairytail.core;

public class Hungry {

    private double hungry;

    public Hungry(double feed){
        this.hungry = feed;
    }

    public Hungry(){
        this(1);
    }

    public boolean is(double hungry){
        return this.hungry == hungry;
    }

    public boolean lowerOrEqualTo(double hungry){
        return this.hungry > hungry;
    }

    public double applyCoeff(int attack){
        return attack*hungry;
    }

    public void feed(Hungry hungry){
        this.hungry += hungry.hungry;
        verify();
    }

    public void makeHungry(Hungry hungry){
        this.hungry -=hungry.hungry;
        verify();
    }

    private void verify(){
        if(hungry > 1) hungry = 1;
        if(hungry < 0) hungry = 0;
    }

}
