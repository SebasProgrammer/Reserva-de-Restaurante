package com.example.demo.repositories;

import com.example.demo.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
    Optional<Restaurant> findById(Long id);
    Optional<Restaurant> findByName(String name);

    @Query("SELECT Rest FROM Restaurant Rest")
    List<Restaurant> findRestaurants();

}
