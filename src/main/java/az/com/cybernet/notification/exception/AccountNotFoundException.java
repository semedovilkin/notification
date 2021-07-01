package az.com.cybernet.notification.exception;

public class AccountNotFoundException extends NotFoundException {

    public static final String MESSAGE = "Account with id %s does not exist.";
    private static final long serialVersionUID = 58432132487812L;

    public AccountNotFoundException(Long id) {
        super(String.format(MESSAGE, id));
    }
}