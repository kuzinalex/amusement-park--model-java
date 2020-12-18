package view;

import user.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductBuyFrame extends JFrame {
    private JPanel panel = new JPanel();
    private JButton productBuyButton = new JButton("Купить товар");
    private JButton backButton = new JButton("Назад");

    User user;

    ProductBuyFrame() {

        user = new User();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        productBuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        panel.add(productBuyButton);
        panel.add(backButton);
        add(panel);
    }
}
