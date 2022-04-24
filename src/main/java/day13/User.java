package day13;

import day12.task5.MusicArtist;

import java.util.ArrayList;
import java.util.List;

public class User {
    String username;
    List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<User>();

    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        getSubscriptions().add(user);
        System.out.println(getSubscriptions().size());

    }

    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return this.subscriptions.contains(user) && user.subscriptions.contains(this);


    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);

    }

    public String toString() {
        return username;
    }

}
