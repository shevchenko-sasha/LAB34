package people;

import enums.Mood;
import interfaces.CanGiveFood;

import java.util.Objects;

public class Mother extends Person implements CanGiveFood {

    public Mother(String name, int age) {
        super(name, age, Mood.HAPPY);
    }

    @Override
    public void giveFood() {
        System.out.println(getName() + " заботливо говорит: 'Вот вам хлеб, детки, пусть он поможет вам в дороге.'");

    }

    public void reactToFatherDecision() {
        System.out.println(getName() + " узнала, что отец собирается отвести детей в лес...");
        changeMood(Mood.SAD);
    }

    @Override
    public void speak() {
        switch (getMood()) {
            case HAPPY -> System.out.println(getName() + " радостно говорит: 'Я приготовлю вам вкусный ужин!'");
            case SAD -> System.out.println(getName() + " грустно говорит: 'Мне так жаль...'");
            case WORRIED -> System.out.println(getName() + " встревоженно говорит: 'Я надеюсь, с вами все будет хорошо.'");
            case HOPEFUL -> System.out.println(getName() + " с надеждой говорит: 'Может быть, все наладится.'");
        }
    }

    @Override
    public String toString() {
        return "Мать: " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}


