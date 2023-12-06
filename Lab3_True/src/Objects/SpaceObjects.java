package Objects;

import Interfaces.Flyable;

import java.security.PublicKey;

public abstract class SpaceObjects implements Flyable {
    String name;

    public String getName(){
            return name;
    }
    public SpaceObjects(String name){
            this.name = name;
    }
    public abstract void getOfffrom();

}
