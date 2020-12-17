package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel panel= new JPanel();
    private JButton productBuyButton = new JButton("Купить товар");
    private JButton ticketBuyButton = new JButton("Купить билет");
    private JButton orderHistoryButton = new JButton("История заказов");
    private JButton personalAccountButton = new JButton("Личный кабинет");
    private JButton backButton = new JButton("Назад");

    MainFrame(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        productBuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        ticketBuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        orderHistoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        personalAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        panel.add(personalAccountButton);
        panel.add(productBuyButton);
        panel.add(ticketBuyButton);
        panel.add(orderHistoryButton);
        panel.add(backButton);
        add(panel);
    }
}
