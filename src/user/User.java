package user;

import controller.OrderController;
import model.*;

public class User {
    private String password;
    private PersonalData personalData;
    private PersonalAccount personalAccount;
    private OrderController orderController;

    public void chooseAttraction(Attraction attraction){}
    public void chooseProduct(Product product){}
    public void toOrder(Order order){}
    public void showOrderHistory(){}
    public void changePassword(){}
    public void addData(PersonalData personalData){}

    public String getPassword() {
        return password;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public PersonalAccount getPersonalAccount() {
        return personalAccount;
    }

    public OrderController getOrderController() {
        return orderController;
    }
}
