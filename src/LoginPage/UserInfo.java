package LoginPage;

import java.io.Serializable;
import java.util.HashMap;
public class UserInfo implements Serializable {
    private String name, password, email;
    public UserInfo() {
        this("", "", "");
    }
    public UserInfo(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
