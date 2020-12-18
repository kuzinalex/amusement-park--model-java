package model;

import java.util.ArrayList;
import java.util.List;

public class PersonalAccount {
    private List<Order> orderList;
    private PersonalData personalData;

    public PersonalAccount() {
        this.orderList = new ArrayList<>();
        this.personalData = new PersonalData();
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }
}
