package org.hV;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List <Vehicle> participants = new ArrayList<>();

    public Race() {
        this.participants.add(new Car("Toyota",0,4));
        this.participants.add(new Motorbike("Yamaha", 2));
        this.participants.add (new Truck("Mercedes",8));
    }

    public void startRace (){
        for (Vehicle participant : participants){
            participant.acceleration();
            System.out.println(participant);
        }

    }
}
