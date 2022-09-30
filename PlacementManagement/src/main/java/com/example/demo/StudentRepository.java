package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/*JPA Repository is exists inspring data jpa dependencies 
 * and  it contaions
 all the CRUd operation of Spring JPA*/
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
