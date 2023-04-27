package LoginPage;

import java.util.HashMap;
public class UserInfo {
    HashMap<String, String> logInfo = new HashMap<>();
    public UserInfo() {
        logInfo.put("65070041", "1234");
    }
    public UserInfo(String name, String password) {
        logInfo.put(name, password);
    }

    public HashMap<String, String> getLoginfo() {
        return logInfo;
    }
}
