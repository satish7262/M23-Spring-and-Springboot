package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/* JPA Repository is exists in String Data JPA dependency and it contain 
 * all the crude operations of spring JPA
 */
public interface CollegeRepository extends JpaRepository<College,Integer> {

}