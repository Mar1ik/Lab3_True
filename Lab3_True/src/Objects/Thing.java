package Objects;

import Enums.Actions;
import Interfaces.ApplyableToSecondStage;
import Interfaces.Calculate;
import Interfaces.Property;
import Interfaces.Verb;

import java.util.Objects;

public class Thing extends NameReturner implements Calculate, Property, ApplyableToSecondStage, Verb {
    private String name;

    public String getName() {
        return this.name;

    }

    @Override
    public String toString() {
        return name;
    }

    public Thing(String name) {
        super(name);
        this.name = name;

    }
    @Override
    public void getCalculate(Actors o){
        System.out.print("Рассчитать " + getName() + " на большее " + o + " было нельзя");
    }

    @Override
    public void getProperty(String property) {
        System.out.print(property + getName());
    }

    @Override
    public void getThink() {
    }

    @Override
    public void getPropertyWith(String property, Actors o) {
        System.out.print(property + getName() + o);
    }

    @Override
    public void getBring(Actions a) {
        switch (a){
            case BRING:
                System.out.print(" остаться место для " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public void getVerb(Actions o){
        switch (o){
            case HAVING:
                System.out.print("Обладая " + getName());
        }
    }

    @Override
    public void create(Actions o) {
        switch (o){
            case CREATE:
                System.out.print(" можно соорудить " +  getName());
        }
    }

    @Override
    public void help(Actions o) {
        switch (o){
            case HELP:
                System.out.print(" который поможет найти Знайку и Пончика");
        }
    }

}
