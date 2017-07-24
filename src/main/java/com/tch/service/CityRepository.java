
package com.tch.service;

import com.tch.domain.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;


interface CityRepository extends Repository<City, Long> {

	Page<City> findAll(Pageable pageable);

	City findById(long id);
}
