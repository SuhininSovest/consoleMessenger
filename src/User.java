import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;

    private List<User> getSubscriptions() {
        return subscriptions;
    }

    private List<User> subscriptions;

    public String getUsername() {
        return username;
    }

    public User(String username) {
        this.username = username;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        if (this.subscriptions.contains(user) && user.subscriptions.contains(this)) {
            return true;
        } else {
            return false;
        }
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString() {
        return username;
    }

}
