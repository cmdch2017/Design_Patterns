package org.example.备忘录模式;

class MementoPatternDemo {

    public static void main(String[] args) {

        Originator originator = new Originator();

        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");

        originator.setState("State #2");

        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");

        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        // Saving the current state
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));

        // Retrieving the first saved state
        System.out.println("First saved State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));

        // Retrieving the second saved state
        System.out.println("Second saved State: " + originator.getState());
    }
}
