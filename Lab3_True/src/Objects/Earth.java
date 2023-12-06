package Objects;

import Enums.Actions;
import Interfaces.ApplyableToSecondStage;

import java.util.Objects;

public class Earth extends SpaceObjects implements ApplyableToSecondStage {

    private Object object;
    private String name;

    public Earth(String name, String object) {
        super(name);
        this.name = name;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void getFly() {

    }

    @Override
    public void getUncalculate(Actors o) {

    }

    @Override
    public void getCalculate() {

    }


    @Override
    public void getOfffrom() {

    }

    @Override
    public void getBring(Actions actions) {
        switch (actions){
            case BRING:
                System.out.print(", который нужно доставить на " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Earth earth = (Earth) o;
        return Objects.equals(object, earth.object) && Objects.equals(name, earth.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object, name);
    }
}
