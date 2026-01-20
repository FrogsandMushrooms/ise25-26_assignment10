package de.seuhd.observer;

import java.util.ArrayList;

public abstract class Subject {
    int  value;
    ArrayList<Observer> attachedObserver = new ArrayList<>();
    int i;
    

    void attach(Observer observer) {
        this.attachedObserver.add(i, observer);
        this.i++ ;

     
    }

    void detach(Observer observer) {
        for (int k = 0; k < attachedObserver.size(); k++) {
            if (this.attachedObserver.get(k) == observer){
                this.attachedObserver.remove(k);
            }

        }
        this.i-- ;
       
    }

    protected void notifyObservers() {
        System.out.println("Sending update to observers...");
            for (int j = 0; j < attachedObserver.size(); j++) {
                this.attachedObserver.get(j).update(this);
            }

        }
        .
    }

