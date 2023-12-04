package com.rating.demo.services.impl;

import com.rating.demo.beans.Discount;
import com.rating.demo.beans.Restaurant;
import com.rating.demo.repositories.DiscountRepository;
import com.rating.demo.repositories.RestaurantRepository;
import com.rating.demo.services.DiscountService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountServicesImpl implements DiscountService
{

    DiscountRepository discountRepository;

    public DiscountServicesImpl(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    private RestaurantRepository restaurantRepository;

    @Override
    public List<Discount> getAllDiscounts() {
        return discountRepository.findAll();
    }

    @Override
    public Discount getDiscountById(int id) {
        return discountRepository.findById(id).orElse(null);
    }

    @Override
    public List<Discount> getDiscountsByRestaurantRestaurantId(Long restaurantId) {
        return discountRepository.findByRestaurantRestaurantId(restaurantId);
    }

    @Override
    public List<Discount> getDiscountsByLocation(String location) {
        return discountRepository.findByLocation(location);
    }


    @Override
    public Discount addDiscount(Discount discount) {
        if (discount.getRestaurantId() != null) {
            Restaurant restaurant = restaurantRepository.findById(discount.getRestaurantId())
                    .orElseThrow(() -> new EntityNotFoundException("Restaurant not found"));
            discount.setRestaurant(restaurant); // Associate the discount with the restaurant
        }
        return discountRepository.save(discount);
    }

    @Override
    public Discount updateDiscount(int id, Discount updatedDiscount) {
        return discountRepository.findById(id)
                .map(discount -> {
                    discount.setLocation(updatedDiscount.getLocation());
                    discount.setTitle(updatedDiscount.getTitle());
                    discount.setDescription(updatedDiscount.getDescription());
                    discount.setValidFrom(updatedDiscount.getValidFrom());
                    discount.setValidUntil(updatedDiscount.getValidUntil());
                    discount.setDiscountRate(updatedDiscount.getDiscountRate());
                    discount.setActive(updatedDiscount.getActive());
                    return discountRepository.save(discount);
                }).orElse(null);
    }

    @Override
    public void deleteDiscount(int id) {
        discountRepository.deleteById(id);
    }
}
