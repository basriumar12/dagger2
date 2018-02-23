package info.blogbasbas.dagger2learn.model;

import android.content.Context;

/**
 * Created by Wim on 8/12/16.
 */
public class UserService {

    private User user;
    Context context;

    public UserService(User user) {
        this.user = user;
    }

    public void addNewUser(String id, String firstname, String lastname) {
        user.setId(id);
        user.setFirstName(firstname);
        user.setLastName(lastname);
    }

    public User getUser() {
        return user;
    }

}
