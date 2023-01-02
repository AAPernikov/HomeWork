package by.belhard.com;

public class Policlinic {
    public static void main(String[] args) {
        Animal c1 = new Cat();
        c1.setName("Barsic");
        c1.setAge(15);
        c1.makeNoise();

        Animal d1 = new Dog();
        d1.setName("Jof");
        d1.setAge(8);
        d1.makeNoise();

        Animal r1 = new Rat();
        r1.setName("Ichi");
        r1.setAge(2);
        r1.makeNoise();

        print(r1);
        print(c1);
        print(d1);
    }
    private static void print (Animal hol){
        System.out.println(hol.getName()+" says "+hol.makeNoise());
    }
}
