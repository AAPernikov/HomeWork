package com.instrument;

public class Tuba implements Instrument {

    private int diametr;

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Играет туба с диаметром "+ diametr);
    }

}
