package Objects;

import Enums.Actions;
import Interfaces.ComponentsOfLastStage;

public class ShipController extends LastStage implements ComponentsOfLastStage {

    public ShipController(String name) {
        super(name);
    }


    @Override
    public void components(String a, String b) {
        System.out.print(getName() + " " + a + ", " + b);
    }

    @Override
    public void getComponents(Actions a) {
        switch (a){
            case NEEDTOHAVE:
                System.out.print(getName() + " должна была иметь двоякое управление ");
        }
    }


}
