package Objects;

import Enums.Actions;
import Interfaces.ComponentsOfLastStage;
import Interfaces.Harder;
import Interfaces.Property;

import java.util.Objects;

public class LastStage extends NameReturner implements Harder, Property, ComponentsOfLastStage {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LastStage lastStage = (LastStage) o;
        return Objects.equals(name, lastStage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public LastStage(String name){
        super(name);
        this.name = name;

    }

    @Override
    public void getHarder() {
        System.out.print(" это очень бы утяжелило " + getName());
    }

    @Override
    public String toString() {
        return name;
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
        System.out.print(property + getName() + " должно остаться место не только для " + o);
    }

    @Override
    public void components(String a, String b) {
        System.out.print(getName() + ":" + a + ", " + b);
    }

    @Override
    public void getComponents(Actions a) {
        switch (a){
            case NEEDTOHAVE:
                System.out.print(getName() + " должна иметь ");
        }
    }
}
