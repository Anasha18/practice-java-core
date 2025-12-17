package org.java.core.lesson1.practice_hm_subscription.model;

public class Subscription {
    protected String id;
    protected String title;
    protected double monthlyPrice;
    protected int startDate;
    protected boolean active;

    public Subscription(String id, String title, double monthlyPrice, int startDate, boolean active) {
        this.id = id;
        this.title = title;
        this.monthlyPrice = monthlyPrice;
        this.startDate = startDate;
        this.active = active;
    }

    public Subscription() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", monthlyPrice=" + monthlyPrice +
                ", startDate=" + startDate +
                ", active=" + active +
                '}';
    }


}
