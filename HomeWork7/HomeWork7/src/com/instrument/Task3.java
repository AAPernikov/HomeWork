package com.instrument;

public class Task3 {
    public static void main(String[] args) {
        Guiter g1 = new Guiter();
        g1.setCount(15);
        Drum d1 = new Drum();
        d1.setSize(120);
        Tuba t1 = new Tuba();
        t1.setDiametr(10);
        Instrument[] array = new Instrument[3];
        array[0] = g1;
        array[1] = d1;
        array[2] = t1;
        for (int i=0; i< array.length;i++){
            array[i].play(); //вернули объект из массива array[i] и тут же выхвали метод .play();
        }
    }
}
