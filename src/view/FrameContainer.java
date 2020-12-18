package view;

import view.*;

public class FrameContainer {
    PersonalAccountFrame personalAccountFrame;
    MainFrame mainFrame;
    EnterFrame enterFrame;
    ProductBuyFrame productBuyFrame;
    TicketBuyFrame ticketBuyFrame;

    public FrameContainer() {
    }

    public FrameContainer(PersonalAccountFrame personalAccountFrame, MainFrame mainFrame, EnterFrame enterFrame, ProductBuyFrame productBuyFrame, TicketBuyFrame ticketBuyFrame) {
        this.personalAccountFrame = personalAccountFrame;
        this.mainFrame = mainFrame;
        this.enterFrame = enterFrame;
        this.productBuyFrame = productBuyFrame;
        this.ticketBuyFrame = ticketBuyFrame;
    }

    public PersonalAccountFrame getPersonalAccountFrame() {
        return personalAccountFrame;
    }

    public void setPersonalAccountFrame(PersonalAccountFrame personalAccountFrame) {
        this.personalAccountFrame = personalAccountFrame;
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public EnterFrame getEnterFrame() {
        return enterFrame;
    }

    public void setEnterFrame(EnterFrame enterFrame) {
        this.enterFrame = enterFrame;
    }

    public ProductBuyFrame getProductBuyFrame() {
        return productBuyFrame;
    }

    public void setProductBuyFrame(ProductBuyFrame productBuyFrame) {
        this.productBuyFrame = productBuyFrame;
    }

    public TicketBuyFrame getTicketBuyFrame() {
        return ticketBuyFrame;
    }

    public void setTicketBuyFrame(TicketBuyFrame ticketBuyFrame) {
        this.ticketBuyFrame = ticketBuyFrame;
    }
}
