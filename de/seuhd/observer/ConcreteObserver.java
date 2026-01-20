package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    Subject connectedSubject;
    String name;
    // TODO: Add fields and static variables.

    public ConcreteObserver(Subject subject, String name) {
        subject.attach(this);
        connectedSubject = subject;
        this.name = name;
        // TODO: Implement constructor.
    }

    @Override
    public void update(Subject subject) {
        System.out.print(name);
        System.out.print(" received update from subject: New value is " );
        System.out.println(subject.value);
        // TODO: Implement update method.
    }

    public void detach() {
        connectedSubject.detach(this);
    }
}
