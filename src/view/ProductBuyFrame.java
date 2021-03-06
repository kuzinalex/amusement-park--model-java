package view;

import user.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductBuyFrame extends JFrame {
    private JPanel componentPanel = new JPanel();
    private JButton productBuyButton = new JButton("Купить товар");
    private JButton backButton = new JButton("Назад");


    public ProductBuyFrame(FrameContainer frameContainer) {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(530, 160);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        componentPanel.setSize(530, 160);
        componentPanel.setLocation(0, 0);
        componentPanel.setLayout(null);

        componentPanel.add(updateComponent(productBuyButton,10,10,500,40));
        componentPanel.add(updateComponent(backButton,10,60,500,40));

        productBuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        backButton.addActionListener(e -> {
            setVisible(false);
            frameContainer.getMainFrame().setVisible(true);
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
