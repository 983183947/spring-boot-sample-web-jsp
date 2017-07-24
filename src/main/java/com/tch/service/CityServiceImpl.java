
package com.tch.service;

import com.tch.domain.City;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;




@Component("cityService")
@Transactional
class CityServiceImpl implements CityService {
	@Autowired
	public CityRepository cityRepository;



//	public CityServiceImpl(CityRepository cityRepository) {
//		this.cityRepository = cityRepository;
//
//	}


	@Override
	public City findCity(long id) {
		return cityRepository.findById(id);
	}
}
