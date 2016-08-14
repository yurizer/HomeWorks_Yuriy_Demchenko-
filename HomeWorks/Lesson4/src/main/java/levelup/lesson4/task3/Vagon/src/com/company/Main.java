package com.company;

//Lesson4.Task3Создать иерархию классов для вагонов поезда.

public class Main {

    public static void main (String[] args) {
        WC hh = new Pass("Вагон пассажирский");
        hh.plugIn();
        Carcass h = new Cargo("Вагон грузовой");
        h.extraCarcass();
    }
}

    abstract class Vagon {
         String name;

    public Vagon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

    interface WC {
        void plugIn();
}

    interface Carcass {
        void extraCarcass();
}
    class Pass extends Vagon implements WC {

        public Pass(String name) {
            super(name);
    }
    public void plugIn() {
        System.out.println(this+" имеется сан.узел!");
    }
}

    class Cargo extends Vagon implements Carcass {

        public Cargo(String name) {
            super(name);
    }
    public void extraCarcass() {
        System.out.println(this+" каркас вагона усилен!");
    }
}

