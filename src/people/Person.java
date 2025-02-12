package people;

import enums.Mood;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Mood mood;

    public Person(String name, int age, Mood mood) {
        this.name = name;
        this.age = age;
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public Mood getMood() {
        return mood;
    }

    public void changeMood(Mood newMood) {
        this.mood = newMood;
        System.out.println(name + " теперь " + mood.getTranslation() + ".");
    }

    public abstract void speak();

    @Override
    public String toString() {
        return "Персонаж: " + name + ", возраст: " + age + ", настроение: " + mood.getTranslation();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name) && mood == person.mood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mood);
    }
}

