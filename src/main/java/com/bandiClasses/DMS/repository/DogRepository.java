package com.bandiClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;


/**
*
* @author Ambica Peruru
* @Sid S550684
*/

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
	

}
