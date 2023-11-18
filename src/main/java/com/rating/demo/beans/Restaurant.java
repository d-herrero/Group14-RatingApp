package com.rating.demo.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer restaurantId;
    @Column
    private String restaurantName;
    @Column
    private Double location;
    @Column
    private Double rating;
    @Column
    private Double studyRating;

    public Integer getRestaurantId() {
        return restaurantId;
    }
    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Double getLocation() {
        return location;
    }
    public void setLocation(Double location) {
        this.location = location;
    }

//    public Double getRating() {
//        return rating;
//    }
//    public void setRating(Double rating) {
//        this.rating = rating;
//    }
//
//    public Double getStudyRating() {
//        return studyRating;
//    }
//    public void setStudyRating(Double studyRating) {
//        this.studyRating = studyRating;
//    }

}
