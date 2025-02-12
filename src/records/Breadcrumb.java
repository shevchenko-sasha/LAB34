package records;

public record Breadcrumb(int number) {
    @Override
    public String toString() {
        return "Крошка №" + number;
    }
}

