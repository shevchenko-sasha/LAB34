package people;

import enums.Mood;

import java.util.Objects;

public class Father extends Person {

    public Father(String name, int age) {
        super(name, age, Mood.WORRIED);
    }

    public void decideToLeaveChildren() {
        System.out.println(getName() + " говорит: 'Нам снова придется отвести детей в лес...'");
        changeMood(Mood.SAD);
    }

    @Override
    public void speak() {
        switch (getMood()) {
            case HAPPY -> System.out.println(getName() + " говорит с облегчением: 'Наконец-то все хорошо.'");
            case SAD -> System.out.println(getName() + " тяжело вздыхает: 'Я не хочу этого делать, но у нас нет выбора...'");
            case WORRIED -> System.out.println(getName() + " тревожно говорит: 'Что же нам делать?'");
            case HOPEFUL -> System.out.println(getName() + " старается не показывать тревогу: 'Может быть, все еще наладится.'");
        }
    }

    @Override
    public String toString() {
        return "Отец: " + super.toString();
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


