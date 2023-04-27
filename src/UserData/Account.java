package UserData;

import java.io.Serializable;

public class Account implements Serializable {
    private String name, password, useType;
    public Account() {
        this("", "", "");
    }
    public Account(String name, String password, String userType) {
        this.name = name;
        this.password = password;
        this.useType = userType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getUseType() {
        return useType;
    }
}
