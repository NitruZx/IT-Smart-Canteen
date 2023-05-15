package LoginPage;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.io.File;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static File dataPath, clientPath, adminPath;
    static {
        File dataPath = new File("UserInfo");
        if (!dataPath.exists()) {
            dataPath.mkdir();
            clientPath = new File(dataPath.getAbsolutePath()+"/Client");
            adminPath = new File(dataPath.getAbsolutePath()+"/Admin");
            clientPath.mkdir();
            adminPath.mkdir();
        } else {
            clientPath = new File(dataPath.getAbsolutePath()+"/Client");
            adminPath = new File(dataPath.getAbsolutePath()+"/Admin");
        }
    }
    public Main() {
        new LoginController();
    }
    public static void main(String[] args) {
//        try
//        {
//            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
//            UIManager.put("RootPane.setupButtonVisible", false);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Main();
    }
}
