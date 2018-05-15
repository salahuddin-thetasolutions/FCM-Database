package theta.solutions.fcmdatabase;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by ThetaTeam2 on 09/04/2018.
 */

@IgnoreExtraProperties
public class User {

    public String name;
    public String email;
    public String token;
    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public User(String name, String email,String Token) {
        this.name = name;
        this.email = email;
        this.token=Token;
    }
}
