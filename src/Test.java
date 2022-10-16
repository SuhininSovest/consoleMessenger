public class Test {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user3, "Hi! I am Alex.");
        user3.sendMessage(user1, "Hello, nice to meet you");

        user1.sendMessage(user3, "Nice to meet you to");
        user3.sendMessage(user1, "Hello, nice to meet you");

        MessageDatabase.showDialog(user1, user3);
    }
}
