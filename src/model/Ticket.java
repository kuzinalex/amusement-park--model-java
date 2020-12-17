package model;

public class Ticket {
    private Attraction attraction;
    private String date;
    private String time;

    public Ticket(Attraction attraction, String date, String time) {
        this.attraction = attraction;
        this.date = date;
        this.time = time;
    }

    public Attraction getAttraction() {
        return attraction;
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
