package com.spring.data.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
    // SELECT 1 FROM cities where name = x
    City findByName(String name);
}
