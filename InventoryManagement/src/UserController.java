import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> users;

    UserController() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }
}
