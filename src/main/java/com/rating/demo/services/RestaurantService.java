package com.rating.demo.services;
import com.rating.demo.beans.Restaurant;


import java.util.List;

public interface RestaurantService {
    public List<Restaurant> getAllRestaurants();
    public Restaurant getRestaurantById(Long id);
    public List<Restaurant> getBooksByRatingAscending(double rating);
    public List<Restaurant> getRestaurantsByLocation(String location);
    public Restaurant addRestaurant(Restaurant restaurant);


}
