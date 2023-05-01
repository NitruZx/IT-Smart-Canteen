package LoginPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoginModel {
    private UserInfo userInfo;
    private LoginGUI loginGUI;
    public LoginModel() {
        userInfo = new UserInfo("", "", "");
    }
    public boolean readObject(String name) {
        File file = new File(Main.clientPath.getAbsolutePath()+"/"+name+".dat");
        if (file.exists()) {
            try (FileInputStream fIn = new FileInputStream(Main.clientPath.getAbsolutePath()+"/"+name+".dat")) {
                ObjectInputStream objectIn = new ObjectInputStream(fIn);
                userInfo = (UserInfo) objectIn.readObject();
                return true;
            } catch (Exception e) {
                System.out.println("Error");
                return false;
            }
        }
        return false;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
