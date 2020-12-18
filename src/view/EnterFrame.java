package view;

import controller.AdminManager;
import controller.UserManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterFrame extends JFrame {
    private JPanel componentPanel = new JPanel();
    private JButton userEnterButton = new JButton("Войти как пользователь");
    private JButton userRegistrationButton = new JButton("Зарегистрироваться как пользователь");
    private JButton adminEnterButton = new JButton("Войти как администратор");
    private JButton adminRegistrationButton = new JButton("Зарегистрироваться как администратор");

    private AdminManager adminManager;
    private UserManager userManager;

    public EnterFrame(FrameContainer frameContainer){
        this.adminManager =new AdminManager();
        this.userManager =new UserManager();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(530, 240);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);


        componentPanel.setSize(530, 240);
        componentPanel.setLocation(0, 0);
        componentPanel.setLayout(null);

        componentPanel.add(updateComponent(userEnterButton,10,10,500,40));
        componentPanel.add(updateComponent(userRegistrationButton,10,60,500,40));
        componentPanel.add(updateComponent(adminEnterButton,10,110,500,40));
        componentPanel.add(updateComponent(adminRegistrationButton,10,160,500,40));
        //componentPanel.add(updateComponent(adminRegistrationButton,10,210,500,40));

        userEnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                frameContainer.getMainFrame().setVisible(true);
            }
        });

        userRegistrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        adminEnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        adminRegistrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
