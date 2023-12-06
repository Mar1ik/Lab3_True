package Objects;

import java.util.Objects;

public class Moon extends SpaceObjects {

    private String object;
    private String type;
    private String name;

    public Moon(String name, String object) {
        super(name);
        this.object = type;
        this.name = name;

    }

    @Override
    public void getFly() {
        System.out.print("Объект летает");
    }

    @Override
    public void getUncalculate(Actors o) {

    }

    @Override
    public void getCalculate() {

    }

    @Override
    public void getOfffrom(){
        super.name = this.name;
        super.name = " при возвращении с " + super.name;
        System.out.print(super.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moon moon = (Moon) o;
        return Objects.equals(object, moon.object) && Objects.equals(type, moon.type) && Objects.equals(name, moon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object, type, name);
    }
}
