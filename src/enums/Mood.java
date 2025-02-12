package enums;

public enum Mood {
    HAPPY("счастливый"),
    SAD("грустный"),
    WORRIED("взволнованный"),
    HOPEFUL("надеющийся");

    private final String translation;

    Mood(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}

