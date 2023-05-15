package LoginPage.Slide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PanelSlide extends JPanel {
    private Timer timer;
    private Component comExit, comShow;
    private List<Component> list;
    private int currentShowin;
    private boolean animateRight;
    private int animateSpeed = 1;
    public PanelSlide() {
        list = new ArrayList<>();
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                animate();
            }
        });

    }
    public void init(Component... com) {
        if (com.length > 0) {
            for (Component c : com) {
                list.add(c);
                c.setSize(getSize());
                c.setVisible(false);
                this.add(c);
            }
            Component show = list.get(0);
            show.setVisible(true);
            show.setLocation(0, 0);

        }
    }
    public void show(int index) {
        if (!timer.isRunning()) {
            if (list.size()>0 && index<list.size() && index != currentShowin) {
                comShow = list.get(index);
                comExit = list.get(currentShowin);
                animateRight = index < currentShowin;
                currentShowin = index;
                comShow.setVisible(true);

                if (animateRight) {
                    comShow.setLocation(-comShow.getWidth(), 0);
                } else {
                    comShow.setLocation(getWidth(), 0);
                }
                timer.start();
            }
        }
    }

    private void animate() {
        if (animateRight) {
            if (comShow.getLocation().x < 0) {
                comShow.setLocation(comShow.getLocation().x+getAnimateSpeed(), 0);
                comShow.setLocation(comShow.getLocation().x+getAnimateSpeed(), 0);
            } else {
                comShow.setLocation(0, 0);
                timer.stop();
                comExit.setVisible(false);
            }
        } else {
            if (comShow.getLocation().x > 0) {
                comShow.setLocation(comShow.getLocation().x - getAnimateSpeed(), 0);
                comExit.setLocation(comExit.getLocation().x - getAnimateSpeed(), 0);
            } else {
                comShow.setLocation(0, 0);
                timer.stop();
                comExit.setVisible(false);
            }
        }
    }

    public void setAnimateSpeed(int animateSpeed) {
        this.animateSpeed = animateSpeed;
    }

    public int getAnimateSpeed() {
        return animateSpeed;
    }
}
