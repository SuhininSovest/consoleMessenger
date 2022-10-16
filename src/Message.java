import java.util.Date;

public class Message {

    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "FROM: " + this.sender +
                "\n TO:" + receiver +
                "\nON: " + this.getDate() + "\n" + text + "\n";
    }
}
