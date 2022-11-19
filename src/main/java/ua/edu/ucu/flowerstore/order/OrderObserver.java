package ua.edu.ucu.flowerstore.order;

import ua.edu.ucu.flowerstore.appuser.AppUser;
import ua.edu.ucu.flowerstore.appuser.Status;

import java.util.ArrayList;
import java.util.List;

public class OrderObserver {
    private final List<AppUser> users = new ArrayList<>();
    public void addUser(AppUser user) {
        users.add(user);
    }
    public void removeUser(AppUser user) {
        users.remove(users.
                stream().
                filter(u -> u.getName().equals(user.getName())).
                findFirst());
    }
    public void notifyUsers() {
        for (AppUser u: users) {
            u.updateStatus(Status.toNotify);
        }
    }
//    public void order();
}
