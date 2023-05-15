package LoginPage;

import javax.swing.*;

public class LoadingPage implements Runnable{
    public JFrame frame;
    private JLabel text;

    public LoadingPage() {
        frame = new JFrame("Loading");
        text = new JLabel("Loading");
        frame.add(text);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(100, 100);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new LoadingPage();
    }

    @Override
    public void run() {
        while (true) {
            text.setText("Loading..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
