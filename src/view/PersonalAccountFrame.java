package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonalAccountFrame extends JFrame {
    private JPanel componentPanel = new JPanel();
    private JButton settingsButton = new JButton("Настройки");
    private JButton updateDateButton = new JButton("Обновить данные");
    private JButton backButton = new JButton("Назад");



    public PersonalAccountFrame(FrameContainer frameContainer){

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(530, 210);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        componentPanel.setSize(530, 210);
        componentPanel.setLocation(0, 0);
        componentPanel.setLayout(null);

        componentPanel.add(updateComponent(settingsButton,10,10,500,40));
        componentPanel.add(updateComponent(updateDateButton,10,60,500,40));
        componentPanel.add(updateComponent(backButton,10,110,500,40));

        updateDateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                frameContainer.getMainFrame().setVisible(true);
            }
        });


        add(componentPanel);
    }
    private JComponent updateComponent(JComponent component, int locationX, int locationY,
                                       int sizeX, int sizeY) {
        component.setSize(sizeX, sizeY);
        component.setLocation(locationX, locationY);
        return component;
    }
}
