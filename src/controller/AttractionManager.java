package controller;

import model.Attraction;

import java.util.List;

public class AttractionManager {
    private List<Attraction> attractionList;

    public void add(Attraction attraction){}
    public void change(Attraction attraction){}
    public void delete(Attraction attraction){}

    public List<Attraction> getAttractionList() {
        return attractionList;
    }

    public void setAttractionList(List<Attraction> attractionList) {
        this.attractionList = attractionList;
    }
}
