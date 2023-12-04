package com.rating.demo.services;

import com.rating.demo.beans.Discount;
import java.util.List;

public interface DiscountService {
    List<Discount> getAllDiscounts();
    Discount getDiscountById(int id);
    List<Discount> getDiscountsByRestaurantRestaurantId(Long restaurantId);

    List<Discount> getDiscountsByLocation(String location);

    Discount addDiscount(Discount discount);
    Discount updateDiscount(int id, Discount updatedDiscount);
    void deleteDiscount(int id);
}
