package Objects;

import Interfaces.*;

import java.util.Objects;

public class Rocket extends NameReturner implements Calculate, Created  {

    private String name;

    public String getName() {
        return this.name;
    }

    public Rocket(String name) {
        super(name);
        this.name = name;

    }



    @Override
    public void getCreated(){
        System.out.print(getName() + " был спроектирован");
    }


    @Override
    public void getCalculate(Actors o) {
        System.out.print(getName() + " был рассчитан на " + o);
    }

    @Override
    public String toString() {
        return name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rocket rocket = (Rocket) o;
        return Objects.equals(name, rocket.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
