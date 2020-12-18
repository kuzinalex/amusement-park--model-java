package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel componentPanel = new JPanel();
    private JButton productBuyButton = new JButton("Купить товар");
    private JButton ticketBuyButton = new JButton("Купить билет");
    private JButton orderHistoryButton = new JButton("История заказов");
    private JButton personalAccountButton = new JButton("Личный кабинет");
    private JButton backButton = new JButton("Назад");

    public MainFrame(FrameContainer frameContainer){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(530, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);


        componentPanel.setSize(530, 290);
        componentPanel.setLocation(0, 0);
        componentPanel.setLayout(null);

        componentPanel.add(updateComponent(productBuyButton,10,10,500,40));
        componentPanel.add(updateComponent(ticketBuyButton,10,60,500,40));
        componentPanel.add(updateComponent(orderHistoryButton,10,110,500,40));
        componentPanel.add(updateComponent(personalAccountButton,10,160,500,40));
        componentPanel.add(updateComponent(backButton,10,210,500,40));

        productBuyButton.addActionListener(e -> {
            setVisible(false);
            frameContainer.getProductBuyFrame().setVisible(true);
        });

        ticketBuyButton.addActionListener(e -> {
            setVisible(false);
            frameContainer.getTicketBuyFrame().setVisible(true);
        });

        orderHistoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        personalAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                frameContainer.getPersonalAccountFrame().setVisible(true);
            }
        });

        backButton.addActionListener(e -> {
            setVisible(false);
            frameContainer.getEnterFrame().setVisible(true);
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
