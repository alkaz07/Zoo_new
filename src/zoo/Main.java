package zoo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //exemple1();
        exemple2();
    }

    private static void exemple2() {
        Bat bat2 = new Bat();
        Duck duck2 = new Duck();
        Eagle eagle2= new Eagle();
        ArrayList<IFlier> fliers = new ArrayList<>();
        fliers.add(bat2);
        fliers.add(duck2);
        fliers.add(eagle2);
        for (IFlier flier: fliers) {
            flier.fly();
        }
        System.out.println("----------------------");
        fliers.add(new Airplane());

        fliers.forEach( IFlier::takeOff);
        fliers.forEach( IFlier::fly );

        ArrayList<ISwimmer> swimmers = new ArrayList<>();
        for(IFlier b:fliers){
            if(b instanceof ISwimmer)
                swimmers.add((ISwimmer) b);
        }
        System.out.println("----------------------");
        swimmers.add(new Whale());
        swimmers.forEach(ISwimmer::swim);
    }

    private static void exemple1() {
        Bat bat1 = new Bat();
        Duck duck1 = new Duck();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(duck1);
        animals.add(bat1);
        for (Animal a:animals) {
            System.out.println(a);
            if(a instanceof Bat)
                ((Bat)a).fly();
            if(a instanceof Duck)
                ((Duck)a).fly();
        }
    }
}
