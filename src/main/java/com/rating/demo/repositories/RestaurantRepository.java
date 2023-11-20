package com.rating.demo.repositories;

import com.rating.demo.beans.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>
{

}
