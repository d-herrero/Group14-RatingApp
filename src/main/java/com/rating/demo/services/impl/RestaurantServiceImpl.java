package com.rating.demo.services.impl;

import com.rating.demo.beans.Restaurant;
import com.rating.demo.services.RestaurantService;
import com.rating.demo.repositories.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService
{
    RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository)
    {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<Restaurant> getAllRestaurants()
    {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant getRestaurantById(Long id)
    {
        return restaurantRepository.getReferenceById(id);
    }

    @Override
    public List<Restaurant> getBooksByRatingAscending(double rating)
    {
        return restaurantRepository.findAll(); // NEEDS UPDATED CODE
    }

    @Override
    public List<Restaurant> getRestaurantsByLocation(String location)
    {
        return restaurantRepository.findAll(); //NEEDS UPDATED CODE
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant)
    {
        return restaurantRepository.save(restaurant);
    }
}
