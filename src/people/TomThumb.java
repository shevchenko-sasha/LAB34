package people;

import enums.Mood;
import records.Breadcrumb;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import exceptions.NotEnoughBreadcrumbsException;

public class TomThumb extends Person {
    private int cleverness;
    private boolean hasPebbles;
    private List<Breadcrumb> breadcrumbs;
    private int breadcrumbCount;

    public TomThumb(String name, int age, Mood mood) {
        super(name, age, mood);
        this.cleverness = new Random().nextInt(11);
        this.hasPebbles = false;
        this.breadcrumbs = new ArrayList<>();
        this.breadcrumbCount = new Random().nextInt(10) + 1;
    }

    public boolean tryToCollectPebbles() {
        System.out.println(getName() + " пытается открыть дверь, чтобы набрать камешков...");
        if (cleverness > 5) {
            System.out.println(getName() + " смог открыть дверь!");
            hasPebbles = true;
            return true;
        } else {
            System.out.println(getName() + " не смог открыть дверь.");
            return false;
        }
    }

    public void dropBreadcrumbs() {
        if (!hasPebbles) {
            if (breadcrumbCount < 3) {  // Если крошек меньше 3
                throw new NotEnoughBreadcrumbsException();  // Выбрасываем исключение
            }

            System.out.println(getName() + " разбрасывает " + breadcrumbCount + " хлебных крошек.");
            for (int i = 1; i <= breadcrumbCount; i++) {
                breadcrumbs.add(new Breadcrumb(i));
            }
        }
    }

    public List<Breadcrumb> getBreadcrumbs() {
        return breadcrumbs;
    }

    public boolean hasPebbles() {
        return hasPebbles;
    }

    @Override
    public void speak() {
        switch (getMood()) {
            case HAPPY -> System.out.println(getName() + " радостно говорит: 'Я найду дорогу домой!'");
            case SAD -> System.out.println(getName() + " грустно говорит: 'Я не знаю, что делать...'");
            case WORRIED -> System.out.println(getName() + " тревожно говорит: 'Я надеюсь, что смогу вернуться.'");
            case HOPEFUL -> System.out.println(getName() + " уверенно говорит: 'Я что-нибудь придумаю!'");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", хитрость: " + cleverness + ", есть ли камешки: " + hasPebbles;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TomThumb tomThumb = (TomThumb) obj;
        return cleverness == tomThumb.cleverness && hasPebbles == tomThumb.hasPebbles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cleverness, hasPebbles);
    }
}


