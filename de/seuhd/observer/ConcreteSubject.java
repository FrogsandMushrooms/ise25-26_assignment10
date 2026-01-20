package de.seuhd.observer;

import java.util.ArrayList;

public class ConcreteSubject extends Subject{

    public ConcreteSubject(){
        this.value = 0;
        this.i = 0;

    }

    public void setValue(int newvalue){
        this.value = newvalue;
        System.out.print("Value of subject updated to ");
        System.out.println(this.value);
        this.notifyObservers();
    }
    
}
