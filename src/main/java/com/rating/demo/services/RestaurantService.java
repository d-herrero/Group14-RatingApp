package com.rating.demo.services;
import com.rating.demo.beans.Restaurant;
import com.rating.demo.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public interface RestaurantService {
    List<Restaurant> getAllRestaurants();
    Restaurant getRestaurantById(Long id);
    List<Restaurant> getBooksByRatingAscending(double rating);
    List<Restaurant> getRestaurantsByLocation(String location);
    Restaurant addRestaurant(Restaurant restaurant);


}
