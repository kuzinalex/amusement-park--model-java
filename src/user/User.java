package user;

import controller.OrderManager;
import model.*;

public class User {
    private String password;
 //   private PersonalData personalData;
    private PersonalAccount personalAccount;
    private OrderManager orderManager;

    public User(String password, OrderManager orderManager) {
        this.password = password;
        this.personalAccount = new PersonalAccount();
        this.orderManager = orderManager;
    }

    public void chooseAttraction(Attraction attraction){}
    public void chooseProduct(Product product){}
    public void toOrder(){}
    public void showOrderHistory(){}
    public void changePassword(){}
    public void addData(PersonalData personalData){}

    public String getPassword() {
        return password;
    }

    public PersonalAccount getPersonalAccount() {
        return personalAccount;
    }

    public OrderManager getOrderController() {
        return orderManager;
    }
}
