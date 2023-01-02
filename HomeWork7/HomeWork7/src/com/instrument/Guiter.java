package com.instrument;

public class Guiter implements Instrument {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн  "+ count);
    }
}
