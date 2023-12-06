import Enums.Actions;
import Enums.Gender;
import Enums.Time;
import Objects.*;

public class Main {
    public static void main(String[] args) {
        Actors znay = new Actors("Знайка ", Gender.Male);
        Actors zvezd = new Actors("Звездочет", Gender.Male);
        Actors all = new Actors("Все", Gender.ALL);
        Rocket starship = new Rocket("Космический корабль");
        Actors they = new Actors("Они", Gender.ALL);
        Actors Cosmonauts = new Actors("двенадцать путешественников", Gender.ALL);
        LastStage leg = new LastStage("последняя ступень");

        Thing pronouns = new Thing("его");
        Thing moonrock = new Thing("лунный камень");
        Thing gravityequipment = new Thing("Прибор невесомости");

        Moon moon = new Moon("Луна", "Спутник");

        Earth earth = new Earth("Земля", "Планета");

        ShipController controller = new ShipController("Двоякое управление");

        //Fisrt
        all.taskWithSMBD(Actions.START, starship);
        System.out.print(".\n");

        //Second
        they.taskWithTime(Actions.DONTSLEEP, Time.NIGHT);
        System.out.print(", ");
        all.taskWithTime(Actions.DONTSLEEP, Time.DAY);
        starship.getCreated();
        System.out.print(".\n");

        //Third
        zvezd.getThink();
        starship.getCalculate(Cosmonauts);
        System.out.print(".\n");


        //Fourth
        pronouns.getCalculate(Cosmonauts);
        leg.getHarder();
        moonrock.getBring(Actions.BRING);
        earth.getBring(Actions.BRING);
        moon.getOfffrom();
        System.out.print(".\n");


        //Fifth
        znay.getThink();
        leg.getComponents(Actions.NEEDTOHAVE);
        controller.components("управление для полетов в условиях тяжести ", "управление для полетов в состоянии невесомости");
        System.out.print(".\n");

        //Sixth
        znay.getHope();
        they.getFind(moonrock);
        System.out.print(".\n");


        //Seventh
        moonrock.getVerb(Actions.HAVING);
        gravityequipment.create(Actions.CREATE);
        gravityequipment.help(Actions.HELP);

    }
}
