package info.blogbasbas.dagger2learn.model;

/**
 * Created by Wim on 8/12/16.
 */
public class User {

    private String id;
    private String firstName;
    private String lastName;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "[id = " +id+ ", firstName = " + firstName + ", lastName = " + lastName + "]";
    }
}
