package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketBuyFrame extends JFrame {
    private JPanel panel= new JPanel();
    private JButton ticketBuyButton = new JButton("Купить билет");
    private JButton backButton = new JButton("Назад");

    TicketBuyFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ticketBuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        panel.add(ticketBuyButton);
        panel.add(backButton);
        add(panel);
    }
}
