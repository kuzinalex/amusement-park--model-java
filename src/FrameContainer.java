import view.*;

public class FrameContainer {
    PersonalAccountFrame personalAccountFrame;
    MainFrame mainFrame;
    EnterFrame enterFrame;
    ProductBuyFrame productBuyFrame;
    TicketBuyFrame ticketBuyFrame;

    public FrameContainer(PersonalAccountFrame personalAccountFrame, MainFrame mainFrame, EnterFrame enterFrame, ProductBuyFrame productBuyFrame, TicketBuyFrame ticketBuyFrame) {
        this.personalAccountFrame = personalAccountFrame;
        this.mainFrame = mainFrame;
        this.enterFrame = enterFrame;
        this.productBuyFrame = productBuyFrame;
        this.ticketBuyFrame = ticketBuyFrame;
    }
}
