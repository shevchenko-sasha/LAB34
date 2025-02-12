package exceptions;

public class NoBreadcrumbsLeftException extends Exception {
    public NoBreadcrumbsLeftException() {
        super("Все хлебные крошки съедены! Мальчик-с-Пальчик потерялся...");
    }

    @Override
    public String getMessage() {
        return "Эх, беда... " + super.getMessage();
    }
}