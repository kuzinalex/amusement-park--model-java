import model.PersonalAccount;
import view.*;

public class Injector {
    public FrameContainer initialize(){
        FrameContainer frameContainer =  new FrameContainer();
        MainFrame mainFrame= new MainFrame(frameContainer);
        EnterFrame enterFrame = new EnterFrame(frameContainer);
        ProductBuyFrame productBuyFrame = new ProductBuyFrame(frameContainer);
        TicketBuyFrame ticketBuyFrame = new TicketBuyFrame(frameContainer);
        PersonalAccountFrame personalAccountFrame = new PersonalAccountFrame(frameContainer);
        frameContainer.setMainFrame(mainFrame);
        frameContainer.setEnterFrame(enterFrame);
        frameContainer.setProductBuyFrame(productBuyFrame);
        frameContainer.setTicketBuyFrame(ticketBuyFrame);
        frameContainer.setPersonalAccountFrame(personalAccountFrame);

        return frameContainer;
    }
}
