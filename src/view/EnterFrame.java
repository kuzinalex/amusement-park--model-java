package view;

import controller.AdminController;
import controller.UserController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterFrame extends JFrame {
    private JPanel panel= new JPanel();
    private JButton userEnterButton = new JButton("Войти как пользователь");
    private JButton userRegistrationButton = new JButton("Зарегистрироваться как пользователь");
    private JButton adminEnterButton = new JButton("Войти как администратор");
    private JButton adminRegistrationButton = new JButton("Зарегистрироваться как администратор");

    AdminController adminController;
    UserController userController;

    EnterFrame(){
        this.adminController=new AdminController();
        this.userController=new UserController();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        userEnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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

        panel.add(userEnterButton);
        panel.add(userRegistrationButton);
        panel.add(adminEnterButton);
        panel.add(adminRegistrationButton);
        add(panel);
        setVisible(true);
    }
}
