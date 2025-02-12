package environment;

import people.TomThumb;
import exceptions.NoBreadcrumbsLeftException;
import java.util.Objects;

public class Home {
    private boolean isSafe;

    public Home() {
        this.isSafe = true;
    }

    public void returnHome(TomThumb tom, Bird bird) throws NoBreadcrumbsLeftException {
        if (tom.hasPebbles()) {
            System.out.println(tom.getName() + " использует камешки и успешно возвращается домой!");
        } else {
            System.out.println(tom.getName() + " надеется найти дорогу по хлебным крошкам...");
            if (bird.eatCrumbs()) {
                throw new NoBreadcrumbsLeftException();
            } else {
                System.out.println("Крошки остались! " + tom.getName() + " нашел дорогу домой!");
            }
        }
    }

    @Override
    public String toString() {
        return "Дом: " + (isSafe ? "безопасный" : "опасный");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Home home = (Home) obj;
        return isSafe == home.isSafe;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSafe);
    }
}


