import people.TomThumb;
import people.Father;
import people.Mother;
import environment.Bird;
import environment.Home;
import enums.Mood;
import exceptions.NoBreadcrumbsLeftException;
import exceptions.NotEnoughBreadcrumbsException;

public class Main {
    public static void main(String[] args) {
        try {
            TomThumb tom = new TomThumb("Мальчик-с-Пальчик", 10, Mood.HOPEFUL);
            Father father = new Father("Отец", 40);
            Mother mother = new Mother("Мать", 38);
            Bird bird = new Bird();
            Home home = new Home();

            System.out.println("Семья Мальчика-с-Пальчика жила счастливо, но вскоре деньги закончились.");
            System.out.println("Отец-дровосек впал в отчаяние и решил вновь отвести детей в лес...");

            father.speak();
            father.decideToLeaveChildren();

            mother.reactToFatherDecision();
            mother.giveFood();

            if (tom.tryToCollectPebbles()) {
                System.out.println(tom.getName() + " собрал камешки и уверен, что найдет дорогу домой.");
            } else {
                System.out.println(tom.getName() + " не смог выбраться из дома и набрать камешки.");
            }

            System.out.println(father.getName() + " ведет детей в лес...");

            if (!tom.hasPebbles()) {
                tom.dropBreadcrumbs();
            }

            System.out.println(tom.getName() + " пытается найти дорогу домой...");

            if (tom.getBreadcrumbs().size() < 3) {
                throw new NotEnoughBreadcrumbsException();
            }

            home.returnHome(tom, bird);

        } catch (NotEnoughBreadcrumbsException e) {
            System.out.println(e.getMessage());
        } catch (NoBreadcrumbsLeftException e) {
            System.out.println(e.getMessage());
        }
    }
}







