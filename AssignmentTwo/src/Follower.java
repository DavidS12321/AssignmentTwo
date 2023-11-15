public class Follower implements Observer {
    private String username;

    public Follower(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println(username + "received an update: " + message);
    }

    public String getUsername() {
        return username;
    }
}