package OOP;

abstract class NotificationMessage {
    protected String recipient;
    protected String message;

    NotificationMessage(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public abstract void displayMessage();
}

interface Sendable {
    void sendMessage();
}

class EmailNotification extends NotificationMessage
        implements Sendable {

    EmailNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void displayMessage() {
        System.out.println("Recipient: " + recipient);
        System.out.println("Message: " + message);
    }

    @Override
    public void sendMessage() {
        System.out.println("Email notification sent.");
    }
}

public class NotificationDemo {
    public static void main(String[] args) {
        NotificationMessage notification =
                new EmailNotification(
                        "student@example.com",
                        "Your enrollment is confirmed."
                );

        notification.displayMessage();

        Sendable sendable = (Sendable) notification;
        sendable.sendMessage();
    }
}