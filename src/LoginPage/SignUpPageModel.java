package LoginPage;

import java.io.*;

public class SignUpPageModel {
    public UserInfo userInfo;
    public SignUpPageModel() {
        userInfo = new UserInfo();
    }
    public boolean writeObject(String name) {
        File file = new File(Main.clientPath.getAbsolutePath()+"/"+name+".dat");
        if (!file.exists()) {
            try (FileOutputStream fOut = new FileOutputStream(Main.clientPath.getAbsolutePath()+"/"+name+".dat")) {
                ObjectOutputStream objectOut = new ObjectOutputStream(fOut);
                objectOut.writeObject(userInfo);
                objectOut.close(); fOut.close();
                return true;
            } catch (IOException i) {
                return false;
            }
        } else {
            System.out.println("Username already exist!!");
        }
        return false;
    }


    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public static void main(String[] args) {
        new SignPageController();
    }
}
