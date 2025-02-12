package exceptions;

public class NotEnoughBreadcrumbsException extends RuntimeException {
    public NotEnoughBreadcrumbsException() {
        super("Недостаточно хлебных крошек! Мальчик-с-Пальчик не может вернуться домой.");
    }

    @Override
    public String getMessage() {
        return "Какой ужас! " + super.getMessage();
    }
}

