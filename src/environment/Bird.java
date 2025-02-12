package environment;

import java.util.Objects;
import java.util.Random;

public class Bird {
    private boolean isHungry;

    public Bird() {
        this.isHungry = new Random().nextBoolean();  // Случайное состояние голода птицы
    }

    public boolean eatCrumbs() {
        if (isHungry) {
            System.out.println("Птицы съели все хлебные крошки!");
            return true;
        } else {
            System.out.println("Птицы не тронули хлебные крошки.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Птица: " + (isHungry ? "голодная" : "сытая");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bird bird = (Bird) obj;
        return isHungry == bird.isHungry;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isHungry);
    }
}


