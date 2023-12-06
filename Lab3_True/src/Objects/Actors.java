package Objects;

import Enums.Actions;
import Enums.Gender;
import Enums.Time;
import Interfaces.Property;
import Interfaces.ApplyableToActors;

public class Actors implements Property, ApplyableToActors {
    private Gender gender;
    private String name;

    public Actors(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void getProperty(String property) {
        this.name = property + " " + name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void task(Actions task) {
        switch (task) {
            case START:
                System.out.print(this.name + "включились в работу по проектированию ");
                break;
            case CREATE:
                System.out.print(this.name + "");
        }
    }

    public void taskWithSMBD(Actions task, Rocket o) {
        switch (task) {
            case START:
                System.out.print(getName() + " включились в работу по проектированию " + o);
        }
    }

    public void taskWithTime(Actions task, Time time) {
        if (task == Actions.DONTSLEEP) {
            if (time == Time.NIGHT) {
                System.out.print(this.name + " не спали всю ночь ");
            } else if (time == Time.DAY) {
                System.out.print("к утру ");
            }
        }
    }

    @Override
    public void getThink() {
        name = "По предположению " + this.name + " ";
        System.out.print(name);
    }

    @Override
    public void getPropertyWith(String property, Actors o) {
        System.out.print(property + getName() + o);
    }

    @Override
    public void getHope(){
        System.out.print(getName() + "надеялся что, ");
    }

    @Override
    public void getFind(Thing o) {
        System.out.print( getName() + " найти " + o);
    }
}

