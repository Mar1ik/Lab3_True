package Objects;

public abstract class NameReturner {
    String name;

    public String getName() {
        return this.name;
    }

    public NameReturner(String name){
        this.name = name;
    }
}
