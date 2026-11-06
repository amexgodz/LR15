package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private int id;
    private String name;
    private String location;
    private int rating;
    private List<Integer> visitorReviews;

    public Cafe(int id, String name, String location, int rating, List<Integer> visitorReviews) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.visitorReviews = new ArrayList<>(visitorReviews);
    }

    public double getAverageReview() {
        if (visitorReviews == null || visitorReviews.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int review : visitorReviews) {
            sum += review;
        }
        return (double) sum / visitorReviews.size();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Integer> getVisitorReviews() {
        return visitorReviews;
    }
}
